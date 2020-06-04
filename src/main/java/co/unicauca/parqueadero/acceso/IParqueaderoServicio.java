package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.Parqueadero;
import java.util.List;

/**
 * Interface que define los servicios con el servidor
 */
public interface IParqueaderoServicio {

    public List<Parqueadero> getParqueaderos() throws Exception;

    public Parqueadero find(String id) throws Exception;

    public boolean create(Parqueadero parq) throws Exception;

    public boolean actualizar(Parqueadero parq) throws Exception;

    public boolean eliminar(String id) throws Exception;
}
