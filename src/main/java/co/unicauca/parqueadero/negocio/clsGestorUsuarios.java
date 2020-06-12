package co.unicauca.parqueadero.negocio;

import co.unicauca.parqueadero.acceso.LoginServicioImplSockets;
import co.unicauca.parqueadero.acceso.ILoginServicio;

/**
 * Fachada con la que se comunica la capa de presentación
 *
 */
public class clsGestorUsuarios {

    ILoginServicio usuarios;
    
    public clsGestorUsuarios() {
     usuarios = new LoginServicioImplSockets();
    }
    
    public clsUsuario find(String login) throws Exception {
        return usuarios.find(login);
    }
    
}
