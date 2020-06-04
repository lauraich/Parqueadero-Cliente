package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.Parqueadero;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;

import java.util.logging.Logger;

/**
 * Clase que implementa los servicios. Para ello utiliza conexiones con sockets
 */
public class ParqueaderoServicioImplSockets implements IParqueaderoServicio {

    private Socket socket = null;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;

    /**
     * Obtiene un parqueadero en formato Json
     *
     * @param id identificador del parqueadero
     * @return json con el parqueadero
     * @throws java.lang.Exception cuando no pueda conectarse con el servidor
     */
    @Override
    public Parqueadero find(String id) throws Exception {

        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida(id);
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
                Parqueadero cliente = new Parqueadero();
                parseToParqueadero(cliente, jsonCliente);
                return cliente;
            }
        }
        return null;

    }

    /**
     * Obtiene una lista de parqueaderos
     *
     * @throws java.lang.Exception cuando no pueda conectarse con el servidor
     */
    public List<Parqueadero> getParqueaderos() throws Exception {
        List<Parqueadero> list = new ArrayList();
        return list;
    }

    /**
     * Crea un parqueadero
     *
     * @param parq parqueadero
     * @return boolean
     * @throws java.lang.Exception cuando no pueda conectarse con el servidor
     */
    public boolean create(Parqueadero parq) throws Exception {
        return false;
    }

    /**
     * actualiza un parqueadero
     *
     * @param parq parqueadero
     * @return boolean
     * @throws java.lang.Exception cuando no pueda conectarse con el servidor
     */
    public boolean actualizar(Parqueadero parq) throws Exception {
        return false;
    }

    /**
     * elimina un parqueadero
     *
     * @param id identificador del parqueadero
     * @return boolean
     * @throws java.lang.Exception cuando no pueda conectarse con el servidor
     */
    public boolean eliminar(String id) throws Exception {
        return false;
    }

    /**
     * Deserializa el objeto json y lo convierte en un objeto Parqueadero
     *
     *
     * @param json objeto cliente en formato json
     */
    private void parseToParqueadero(Parqueadero parqueadero, String json) {
        Gson gson = new Gson();
        Properties properties = gson.fromJson(json, Properties.class);
        parqueadero.setNombre(properties.getProperty("nombreParqueadero"));
        parqueadero.setDireccion(properties.getProperty("direccion"));
        parqueadero.setTelefono(properties.getProperty("telefono"));
    }

    /**
     * Lee el flujo del socket y lo convierte a String
     *
     * @param id identificador del parqueadero
     * @return
     * @throws IOException
     */
    private String leerFlujoEntradaSalida(String id) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println("find|" + id);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }
        System.out.println("respuesta" + respuesta);
        return respuesta;
    }

    private void cerrarFlujos() {
        salidaDecorada.close();
        entradaDecorada.close();
    }

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
}
