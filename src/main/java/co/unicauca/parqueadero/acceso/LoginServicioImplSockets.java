/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsUsuario;
import co.unicauca.parqueadero.transversal.JSONServices;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase que implementa los servicios . Para ello utiliza conexiones con sockets
 *
 */
public class LoginServicioImplSockets implements ILoginServicio {

    private Socket socket = null;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;
    private JSONServices atrParse = JSONServices.getInstancia();


    /**
     * Obtiene el login de un cliente en formato Json
     *
     * @param usuario nombre del usuario
     * @param contraseña contraseña del usuario
     */
    @Override
    public boolean login(String usuario, String contraseña) throws Exception {

        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida(usuario, contraseña);
            cerrarFlujos();
            desconectar();

        } catch (IOException ex) {
            Logger.getLogger(LoginServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jsonCliente == null) {
            throw new Exception("No se pudo conectar con el servidor");
        } else {
            if (!jsonCliente.equals("FALSE")) {
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
    private String leerFlujoEntradaSalida(String usuario, String contraseña) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println("login|" + usuario + "|" + contraseña);
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

    /**
     * Desconecta la conexión
     */
    private void desconectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(LoginServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
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
    public clsUsuario find(String login) throws Exception {
         String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida("findUser|",login);
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
                clsUsuario user;
                user=atrParse.parseToUsuario(jsonCliente);
                return user;
            }
        }
        return null;
    }
}
