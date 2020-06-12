package co.unicauca.parqueadero.negocio;

import co.unicauca.parqueadero.acceso.IParqueaderoServicio;
import co.unicauca.parqueadero.acceso.ParqueaderoServicioImplSockets;
import java.util.List;

/**
 * Fachada con la que se comunica la capa de presentación
 *
 */
public class GestorParqueadero {

    IParqueaderoServicio parqueaderos;

    /**
     * Constructor
     */
    public GestorParqueadero() {
        this.parqueaderos = new ParqueaderoServicioImplSockets();
    }
    
    public List<Parqueadero> getParqueaderos(String cedula) throws Exception {
        return parqueaderos.getParqueaderos();
    }
    
    /**
     * muestra todos los parqueaderos registrados
     *
     * @return Una lista de tipo Parqueadero
     * @throws java.lang.Exception la excepcion se lanza cuando no logra
     * conexión con el servidor
     */
    public List<Parqueadero> getParqueaderos() throws Exception {
        return parqueaderos.getParqueaderos();
    }

    /**
     * busca un parqueadero
     *
     * @param id identificador del parqueadero
     * @return Objeto de tipo Parqueadero
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public Parqueadero find(String id) throws Exception {
        return parqueaderos.find(id);
    }

    /**
     * crea un parqueadero
     *
     * @param parq parqueadero que se quiere crear
     * @return Boolean que indica si pudo realizar la creacion del parqueadero
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public boolean create(Parqueadero parq) throws Exception {
        return parqueaderos.create(parq);
    }

    /**
     * actualiza la información de un parqueadero
     *
     * @param parq parqueadero al cual se le quiere actualizar información
     * @return Boolean que indica si pudo realizar la actualización
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public boolean actualizar(Parqueadero parq) throws Exception {
        return parqueaderos.actualizar(parq);
    }

    /**
     * elimina un parqueadero
     *
     * @param id identifacion del parqueadero
     * @return Boolean que indica si pudo realizar la eliminación
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public boolean eliminar(String id) throws Exception {
        return parqueaderos.eliminar(id);
    }

}
