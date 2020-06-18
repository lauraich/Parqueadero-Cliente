package co.unicauca.parqueadero.negocio;

import co.unicauca.parqueadero.acceso.ParqueoServicioImplSockets;
import co.unicauca.parqueadero.acceso.IRegistroParqueo;

/**
 * Fachada con la que se comunica la capa de presentación
 *
 */
public class GestorParqueo {

    IRegistroParqueo RegistroParqueo;

    /**
     * Constructor
     */
    public GestorParqueo() {
        RegistroParqueo = new ParqueoServicioImplSockets();
    }

    /**
     * registra la entrada de un vehiculo
     *
     * @param registro registro de la entrada
     * @return Boolean que indica si pudo realizar el registro de la entrada
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public boolean registrarEntrada(clsRegistroParqueo registro) throws Exception {
        return RegistroParqueo.registrarEntrada(registro);
    }

    /**
     * registra la salida de un vehiculo
     *
     * @param registro registro de la salida
     * @return Boolean que indica si pudo realizar el registro de la salida
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public boolean registrarSalida(clsRegistroParqueo registro) throws Exception {
        return RegistroParqueo.registrarSalida(registro);
    }

    /**
     * busca el registro parqueo filtrando por la placa del vehiculo
     *
     * @param placa identificador del vehiculo
     * @param prmIdParqueadero identificador del parqueadero
     * @return objeto de tipo resgistro parqueo si se encuentra
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public clsRegistroParqueo buscarXplaca(String placa, String prmIdParqueadero) throws Exception {
        return RegistroParqueo.buscarXplaca(placa, prmIdParqueadero);
    }

    /**
     * busca el registro parqueo filtrando por el codigo de barras
     *
     * @param codigo codigo de barras del registro
     * @param prmIdParqueadero identificador del parqueadero
     * @return objeto de tipo registro parqueo si se encuentra
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public clsRegistroParqueo buscarXcodigo(String codigo, String prmIdParqueadero) throws Exception {
        return RegistroParqueo.buscarXcodigo(codigo, prmIdParqueadero);
    }
}
