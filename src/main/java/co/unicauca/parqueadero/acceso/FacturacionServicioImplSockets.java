/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsFactura;
import co.unicauca.parqueadero.negocio.clsRegistroParqueo;
import co.unicauca.parqueadero.transversal.JSONServices;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class FacturacionServicioImplSockets implements IFacturacionServicio{

    private Socket socket = null;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;
    private JSONServices atrParse = JSONServices.getInstancia();
    
    /**
     * Lee el flujo del socket y lo convierte a String
     *
     * @param id identificador del cliente
     * @return
     * @throws IOException
     */
    private String leerFlujoEntradaSalida(String metodo,String parametro) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println( metodo + parametro);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }
        System.out.println("respuesta :" + respuesta);
        return respuesta;
    }
    private String leerFlujoEntradaSalida(String metodo,String prmTipoVehiculo, String prmDias, String prmHoras, String prmMinutos) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println( metodo + prmTipoVehiculo + "|" + prmDias + "|" + prmHoras + "|" + prmMinutos);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }
        System.out.println("respuesta :" + respuesta);
        return respuesta;
    }
    
  private void cerrarFlujos() {
        salidaDecorada.close();
        entradaDecorada.close();
    }

    /**
     * Desconecta la conexión
     */
    private void desconectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(FacturacionServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Pide conexión con el servidor
     *
     * @param address
     * @param port
     * @throws IOException
     */
    public void conectar(String address, int port) throws IOException {
        socket = new Socket(address, port);
        System.out.println("Conectado");
    }
    
    @Override
    public String totalPagar(String prmTipoVehiculo,String prmDias,String prmHoras,String prmMinutos) throws Exception {
        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida("valorApagar|",prmTipoVehiculo,prmDias,prmHoras,prmMinutos);
            cerrarFlujos();
            desconectar();

        } catch (IOException ex) {
            Logger.getLogger(FacturacionServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jsonCliente == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {
            if (!jsonCliente.equals("NO_ENCONTRADO")) {
                //Lo encontró
                return jsonCliente;
            }
        }
        return null;
    }

    @Override
    public boolean registrarFactura(clsFactura prmFactura) throws Exception{
        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida("guardarFactura|",atrParse.parseToJSON(prmFactura));
            cerrarFlujos();
            desconectar();

        } catch (IOException ex) {
            Logger.getLogger(FacturacionServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jsonCliente == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {
            if (jsonCliente.equals("TRUE")) {
                //Lo encontró
                return true;
            }
        }
        return false;
    }

    
    
}
