
package co.unicauca.parqueadero.negocio;

import co.unicauca.parqueadero.acceso.EntradaServicioImplSockets;
import co.unicauca.parqueadero.acceso.IRegistroParqueo;

/**
 * Fachada con la que se comunica la capa de presentación
 *
 */
public class GestorEntrada {

    IRegistroParqueo RegistroEntrada;

    /**
     * Constructor
     */
    public GestorEntrada() {
        RegistroEntrada = new EntradaServicioImplSockets();
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

}
