package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsRegistroParqueo;
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
public class ParqueoServicioImplSockets implements IRegistroParqueo {

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
            jsonCliente = leerFlujoEntradaSalida("registrarEntrada|", atrParse.parseToJson(prmRegistroParqueo));
            cerrarFlujos();
            desconectar();

        } catch (IOException ex) {
            Logger.getLogger(ParqueoServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
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
    private String leerFlujoEntradaSalida(String metodo, String prmJSONRegistro) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println(metodo + prmJSONRegistro);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }
        System.out.println("respuesta :" + respuesta);
        return respuesta;
    }

    /**
     * Lee el flujo del socket y lo convierte a String
     *
     * @param id identificador del cliente
     * @return
     * @throws IOException
     */
    private String leerFlujoEntradaSalida(String metodo, String prmPlacaCodigo, String prmIdParquadero) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println(metodo + prmPlacaCodigo + "|" + prmIdParquadero);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }
        System.out.println("respuesta :" + respuesta);
        return respuesta;
    }

    /**
     * Cierra flujos de entrada y salida
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
            Logger.getLogger(ParqueoServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
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
     * Registra la salida de un vehiculo del parqueadero
     *
     * @param prmRegistroParqueo registro de parqueo del vehiculo
     * @return boolean
     * @throws java.lang.Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public boolean registrarSalida(clsRegistroParqueo prmRegistroParqueo) throws Exception {
        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida("registrarSalida|", atrParse.parseToJson(prmRegistroParqueo));
            cerrarFlujos();
            desconectar();

        } catch (IOException ex) {
            Logger.getLogger(ParqueoServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
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
     * Busca un registro de parqueo filtrando por la placa del vehiculo
     *
     * @param placa identificador del vehiculo
     * @param prmIdParqueadero identificador del parqueadero
     * @return objeto de registro parqueo
     * @throws java.lang.Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public clsRegistroParqueo buscarXplaca(String placa, String prmIdParqueadero) throws Exception {
        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida("buscarXplaca|", placa, prmIdParqueadero);
            cerrarFlujos();
            desconectar();

        } catch (IOException ex) {
            Logger.getLogger(ParqueoServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jsonCliente == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {
            if (!jsonCliente.equals("NO_ENCONTRADO")) {
                //Lo encontró
                clsRegistroParqueo registro;
                registro = atrParse.parseToRegistroParqueo(jsonCliente);
                return registro;
            }
        }
        return null;
    }

    /**
     * Busca un registro de parqueo filtrando por el codigo de barras
     *
     * @param codigo codigo de barras del registro
     * @param prmIdParqueadero identificador del parqueadero
     * @return objeto de registro parqueo
     * @throws java.lang.Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public clsRegistroParqueo buscarXcodigo(String codigo, String prmIdParqueadero) throws Exception {
        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida("buscarXcodigo|", codigo, prmIdParqueadero);
            cerrarFlujos();
            desconectar();

        } catch (IOException ex) {
            Logger.getLogger(ParqueoServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jsonCliente == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {
            if (!jsonCliente.equals("NO_ENCONTRADO")) {
                //Lo encontró
                clsRegistroParqueo registro;
                registro = atrParse.parseToRegistroParqueo(jsonCliente);
                return registro;
            }
        }
        return null;
    }
}
