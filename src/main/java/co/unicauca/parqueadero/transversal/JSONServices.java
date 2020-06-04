/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.transversal;
import co.unicauca.parqueadero.negocio.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.List;

/**
 *
 * @author Fernando Campo
 */
public class JSONServices {
    private clsGestorUsuarios atrGestorUsuarios=new clsGestorUsuarios();
    private static JSONServices atrParseToJSON;
    public static JSONServices getInstancia(){
        if(atrParseToJSON==null){
            atrParseToJSON=new JSONServices();
        }
        return atrParseToJSON;
    }
    public String parseToJSON(List<Parqueadero> prmParqueaderos){
        JsonArray jsonArray = new JsonArray();
        for (Parqueadero objParqueadero : prmParqueaderos) {
            jsonArray.add(parseToJson(objParqueadero));
        }
        return jsonArray.toString();
    }
    public String parseToJSON(Parqueadero prmParqueadero){
        return parseToJson(prmParqueadero).toString();
    }
    private JsonObject parseToJson(Parqueadero prmParqueadero){
        JsonObject jsonObj=new JsonObject();
            jsonObj.addProperty("NombreParqueadero", prmParqueadero.getNombre());
            jsonObj.addProperty("Direccion", prmParqueadero.getDireccion());
            jsonObj.addProperty("Telefono", prmParqueadero.getTelefono());
            jsonObj.addProperty("IDParqueadero", prmParqueadero.getId());
            return jsonObj;
    }
    public String parseToJson(clsRegistroParqueo prmRegistro){
        JsonObject jsonObj=new JsonObject();
        jsonObj.addProperty("Vehiculo",parseToJSON(prmRegistro.getVehiculo()));
        jsonObj.addProperty("Usuario",parseToJSON(prmRegistro.getUsuario()));
        jsonObj.addProperty("CodigoBarras",prmRegistro.getCodigoBarras());
        jsonObj.addProperty("NombresApellidosProp",prmRegistro.getNombresApellidosProp());
        jsonObj.addProperty("FechaHoraEntrada",prmRegistro.getFechaHoraEntrada());
        jsonObj.addProperty("FechaHoraSalida",prmRegistro.getFechaHoraSalida());
        jsonObj.addProperty("NumeroCascos",prmRegistro.getNumeroCascos());
        jsonObj.addProperty("NumeroCasillero",prmRegistro.getNumeroCasillero());
        jsonObj.addProperty("DejaLlaves",prmRegistro.getDejaLlaves());
        jsonObj.addProperty("Observaciones",prmRegistro.getObservaciones());
        jsonObj.addProperty("IdParqueadero",prmRegistro.getIdParqueadero());
        return jsonObj.toString();
    }
    public String parseToJSON(Vehiculo prmVehiculo){
        JsonObject jsonObj=new JsonObject();
        jsonObj.addProperty("Placa", prmVehiculo.getPlaca());
        jsonObj.addProperty("TipoVehiculo", prmVehiculo.getTipoVehiculo());
        return jsonObj.toString();
    }
    public String parseToJSON(clsUsuario prmUser){
        JsonObject jsonObj=new JsonObject();
        jsonObj.addProperty("Cedula",prmUser.getAtrCedula());
        jsonObj.addProperty("Nombres",prmUser.getAtrNombres());
        jsonObj.addProperty("Apellidos",prmUser.getAtrApellidos());
        jsonObj.addProperty("Rol",prmUser.getAtrRol());
        jsonObj.addProperty("Login", prmUser.getAtrLogin());
        jsonObj.addProperty("Password",prmUser.getAtrPassword());
        return jsonObj.toString();
    }
}
