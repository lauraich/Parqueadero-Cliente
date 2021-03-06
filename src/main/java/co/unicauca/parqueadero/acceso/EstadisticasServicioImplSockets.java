package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsEstadisticas;
import co.unicauca.parqueadero.transversal.JSONServices;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa los servicios . Para ello utiliza conexiones con sockets
 *
 */
public class EstadisticasServicioImplSockets implements IEstadisticasServicio {

    private Socket socket = null;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;
    private JSONServices atrParse = JSONServices.getInstancia();

   /**
    * Lee el flujo del socket y lo convierte a String
    * @param metodo metodo a utilizar del servidor
    * @param prmFecha fecha en la cual se quieren consultar los registros
    * @param prmIdParqueadero id del parqueadero del cual se quieren consultar los registros
    * @return String respuesta del servidor
    * @throws IOException 
    */
    private String leerFlujoEntradaSalida(String metodo, String prmFecha, String prmIdParqueadero) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println(metodo + prmFecha + "|" + prmIdParqueadero);
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
     * Recoge los datos de ingresos por hora del parqueadero
     *
     * @param fecha
     * @param idParqueadero
     * @return lista de estadisticas
     * @throws Exception
     */
    @Override
    public List<clsEstadisticas> generarEstadisticas(String fecha, String idParqueadero) throws Exception {
        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida("afluencia|", fecha, idParqueadero);
            cerrarFlujos();
            desconectar();

        } catch (IOException ex) {
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jsonCliente == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {
            if (!jsonCliente.equals("NO_ENCONTRADO")) {
                //Lo encontró
                List<clsEstadisticas> listaCongestion = null;
                listaCongestion = atrParse.parseToEstadisticas(jsonCliente);
                return listaCongestion;
            }
        }
        return null;
    }

}
