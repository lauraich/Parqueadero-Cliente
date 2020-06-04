//
//package co.unicauca.parqueadero.negocio;
//import co.unicauca.parqueadero.acceso.IParqueaderoServicio;
//import co.unicauca.parqueadero.acceso.ParqueaderoServicioImplSockets;
//import java.util.List;
///**
// *
// * @author Usuario
// */
//public class GestorParqueadero {
//    IParqueaderoServicio parqueaderos;
//
//    public GestorParqueadero() {
//        this.parqueaderos = new ParqueaderoServicioImplSockets();
//    }
//     public List<Parqueadero> getParqueaderos() throws Exception{
//        return parqueaderos.getParqueaderos();
//    }
//
//    public Parqueadero find(String id) throws Exception{
//        return parqueaderos.find(id);
//    }
//
//    public boolean create(Parqueadero parq) throws Exception{
//        return parqueaderos.create(parq);
//    }
//
//    public boolean actualizar(Parqueadero parq) throws Exception {
//        return parqueaderos.actualizar(parq);
//    }
//
//    public boolean eliminar(String id) throws Exception{
//        return parqueaderos.eliminar(id);
//    }
//
//}
