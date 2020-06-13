package co.unicauca.parqueadero.negocio;

import co.unicauca.parqueadero.acceso.ParqueoServicioImplSockets;
import co.unicauca.parqueadero.acceso.IRegistroParqueo;

/**
 * Fachada con la que se comunica la capa de presentación
 *
 */
public class GestorParqueo {

    IRegistroParqueo RegistroEntrada;

    /**
     * Constructor
     */
    public GestorParqueo() {
        RegistroEntrada = new ParqueoServicioImplSockets();
    }

    /**
     * registra la entrada de un cliente
     *
     * @param registro registro de la entrada
     * @return Boolean que indica si pudo realizar el registro de la entrada
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public boolean registrarEntrada(clsRegistroParqueo registro) throws Exception {
        return RegistroEntrada.registrarEntrada(registro);
    }

    public boolean registrarSalida(clsRegistroParqueo registro) throws Exception {
        return RegistroEntrada.registrarSalida(registro);
    }

    public clsRegistroParqueo buscarXplaca(String placa,String prmIdParqueadero) throws Exception {
        return RegistroEntrada.buscarXplaca(placa,prmIdParqueadero);
    }

    public clsRegistroParqueo buscarXcodigo(String codigo,String prmIdParqueadero) throws Exception {
        return RegistroEntrada.buscarXcodigo(codigo,prmIdParqueadero);
    }
}
