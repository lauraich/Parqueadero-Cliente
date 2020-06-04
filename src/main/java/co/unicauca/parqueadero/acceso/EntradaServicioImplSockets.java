package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsRegistroParqueo;
import co.unicauca.parqueadero.transversal.JSONServices;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;

import java.util.logging.Logger;

/**
 * Clase que implementa los servicios . Para ello utiliza conexiones con sockets
 *
 */
public class EntradaServicioImplSockets implements IRegistroParqueo {

    private Socket socket = null;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;
    private JSONServices atrParse = JSONServices.getInstancia();

    /**
     * Obtiene el registro de un cliente en formato Json
     *
     * @param prmRegistroParqueo identificador de la entrada
     * @return json con el registro del cliente
     * @throws java.lang.Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public boolean registrarEntrada(clsRegistroParqueo prmRegistroParqueo) throws Exception {
        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida(atrParse.parseToJson(prmRegistroParqueo));
            cerrarFlujos();
            desconectar();

        } catch (IOException ex) {
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
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

    /**
     * Lee el flujo del socket y lo convierte a String
     *
     * @param id identificador del cliente
     * @return
     * @throws IOException
     */
    private String leerFlujoEntradaSalida(String prmJSONRegistroEntrada) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println("registrarEntrada|" + prmJSONRegistroEntrada);
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
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
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
    public boolean registrarSalida(clsRegistroParqueo prmRegistroParqueo) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
