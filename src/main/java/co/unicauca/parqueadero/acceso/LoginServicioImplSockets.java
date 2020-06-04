/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.acceso;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class LoginServicioImplSockets implements ILoginServicio{
    
    private Socket socket = null;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;

   
    @Override
    public boolean login(String usuario,String contraseña) throws Exception {

        String jsonCliente = null;
        try {
            conectar(IP_SERVIDOR, PUERTO);
            jsonCliente = leerFlujoEntradaSalida(usuario,contraseña);
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

   
    private String leerFlujoEntradaSalida(String usuario,String contraseña) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println("login|" + usuario+"|" + contraseña);
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
            Logger.getLogger(LoginServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Pide conexión con el servidor
     * @param address
     * @param port
     * @throws IOException 
     */
    public void conectar(String address, int port) throws IOException {
        socket = new Socket(address, port);
        System.out.println("Conectado");
    }
}
