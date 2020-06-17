package co.unicauca.parqueadero.negocio;

import co.unicauca.parqueadero.acceso.LoginServicioImplSockets;
import co.unicauca.parqueadero.acceso.ILoginServicio;

/**
 * Fachada con la que se comunica la capa de presentación
 *
 */
public class clsGestorUsuarios {

    ILoginServicio usuarios;

    /**
     * Constructor
     */
    public clsGestorUsuarios() {
        usuarios = new LoginServicioImplSockets();
    }

    /**
     * Busca un usuario a través del login
     *
     * @param login identificador del usuario
     * @return objeto de tipo usuario
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public clsUsuario find(String login) throws Exception {
        return usuarios.find(login);
    }

}
