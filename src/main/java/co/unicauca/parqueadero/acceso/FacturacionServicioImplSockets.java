package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsFactura;
import co.unicauca.parqueadero.transversal.JSONServices;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa los servicios . Para ello utiliza conexiones con sockets
 *
 */
public class FacturacionServicioImplSockets implements IFacturacionServicio {

    private Socket socket = null;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;
    private JSONServices atrParse = JSONServices.getInstancia();

    /**
     * Lee el flujo del socket y lo convierte a String
     *
     * @param metodo metodo del servidor a usar
     * @param parametro parametro que reciba el metodo
     * @return String
     * @throws IOException
     */
    private String leerFlujoEntradaSalida(String metodo, String parametro) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println(metodo + parametro);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }
        System.out.println("respuesta :" + respuesta);
        return respuesta;
    }

    /**
     * Lee el flujo del socket y lo convierte a String
     *
     * @param metodo metodo del servidor a usar
     * @param prmTipoVehiculo parametro que contiene el tipo de vehiculo
     * @param prmDias parametro que contiene el número de días transcurridos
     * @param prmHoras parametro que contiene el número de horas transcurridos
     * @param prmMinutos parametro que contiene el número de minutos
     * @param prmSegundos parametro que contiene el número de segundos
     * transcurridos
     * @return String
     * @throws IOException
     */
    private String leerFlujoEntradaSalida(String metodo, String prmTipoVehiculo, String prmDias, String prmHoras, String prmMinutos, String prmSegundos) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println(metodo + prmTipoVehiculo + "|" + prmDias + "|" + prmHoras + "|" + prmMinutos + "|" + prmSegundos);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }
        System.out.println("respuesta :" + respuesta);
        return respuesta;
    }

    /**
     * Cierra los flujos de entrada y salida
     */
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

    /**
     * Calcula el valor a pagar dependiendo del tiempo transcurrido en el
     * parqueadero
     *
     * @param prmTipoVehiculo parametro que contiene el tipo de vehiculo
     * @param prmDias parametro que contiene el número de días transcurridos
     * @param prmHoras parametro que contiene el número de horas transcurridos
     * @param prmMinutos parametro que contiene el número de minutos
     * @return el total a pagar
     * @throws Exception
     */
    @Override
    public String totalPagar(String prmTipoVehiculo, String prmDias, String prmHoras, String prmMinutos, String prmSegundos) throws Exception {
        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida("valorApagar|", prmTipoVehiculo, prmDias, prmHoras, prmMinutos, prmSegundos);
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

    /**
     * Guarda la factura de la salida correspondiente parqueadero
     *
     * @param prmFactura objeto factura que se va a guardar
     * @return true si el registro se pudo realizar y false pasa lo contrario
     * @throws Exception
     */
    @Override
    public boolean registrarFactura(clsFactura prmFactura) throws Exception {
        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida("guardarFactura|", atrParse.parseToJSON(prmFactura));
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
