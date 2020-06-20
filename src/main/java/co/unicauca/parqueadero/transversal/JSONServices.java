/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.transversal;

import co.unicauca.parqueadero.negocio.*;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Fernando Campo
 */
public class JSONServices {

    private static JSONServices atrParseToJSON;

    public static JSONServices getInstancia() {
        if (atrParseToJSON == null) {
            atrParseToJSON = new JSONServices();
        }
        return atrParseToJSON;
    }
     /**
     * Convierte a JSON una lista de estadisticas.
     *
     * @param prmEstadisticas Lista de estadisticas
     * @return
     */
    public String parseToJSONE(List<clsEstadisticas> prmEstadisticas) {
        JsonObject jsonObj = new JsonObject();
        int i = 1;
        for (clsEstadisticas objEstadistica : prmEstadisticas) {
            jsonObj.addProperty(String.valueOf(i), parseToJSON(objEstadistica));
            System.out.println("Objeto: " + jsonObj.toString());
            i++;
        }
        return jsonObj.toString();
    }

    /**
     * Convierte a JSON un objeto de estadisticas.
     *
     * @param prmEstadistica Lista de estadisticas
     * @return
     */
    public String parseToJSON(clsEstadisticas prmEstadistica) {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("Hora", prmEstadistica.getHora());
        jsonObj.addProperty("NumeroIngresos", prmEstadistica.getNumeroEntradas());
        return jsonObj.toString();
    }
    /**
     * Realiza el parse de una lista de parqueaderos a un objeto JSON
     *
     * @param prmParqueaderos listade parqueaderos
     * @return String objeto json
     *
     */
    public String parseToJSON(List<Parqueadero> prmParqueaderos) {
        JsonObject jsonObj = new JsonObject();
        int i = 1;
        for (Parqueadero objParqueadero : prmParqueaderos) {
            jsonObj.addProperty(String.valueOf(i), parseToJSON(objParqueadero));
            System.out.println("Objeto: " + jsonObj.toString());
            i++;
        }
        return jsonObj.toString();
    }

    /**
     * Realiza el parse de un objeto parqueadero a un objeto JSON
     *
     * @param prmParqueadero objeto parqueadero
     * @return String objeto json
     *
     */
    public String parseToJSON(Parqueadero prmParqueadero) {
        return parseToJson(prmParqueadero).toString();
    }

    /**
     * Realiza el parse de un objeto parqueadero a un objeto JSON
     *
     * @param prmParqueaderos objeto parqueaderos
     * @return JsonObject objeto Json
     *
     */
    private JsonObject parseToJson(Parqueadero prmParqueadero) {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("NombreParqueadero", prmParqueadero.getNombre());
        jsonObj.addProperty("Direccion", prmParqueadero.getDireccion());
        jsonObj.addProperty("Telefono", prmParqueadero.getTelefono());
        jsonObj.addProperty("IDParqueadero", prmParqueadero.getId());
        return jsonObj;
    }

    /**
     * Realiza el parse de un objeto de registro parqueo a un objeto JSON
     *
     * @param prmRegistro registro parqueo
     * @return String
     *
     */
    public String parseToJson(clsRegistroParqueo prmRegistro) {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("Vehiculo", parseToJSON(prmRegistro.getVehiculo()));
        jsonObj.addProperty("Usuario", parseToJSON(prmRegistro.getUsuario()));
        jsonObj.addProperty("CodigoBarras", prmRegistro.getCodigoBarras());
        jsonObj.addProperty("NombresApellidosProp", prmRegistro.getNombresApellidosProp());
        jsonObj.addProperty("FechaHoraEntrada", prmRegistro.getFechaHoraEntrada());
        jsonObj.addProperty("FechaHoraSalida", prmRegistro.getFechaHoraSalida());
        jsonObj.addProperty("NumeroCascos", prmRegistro.getNumeroCascos());
        jsonObj.addProperty("NumeroCasillero", prmRegistro.getNumeroCasillero());
        jsonObj.addProperty("DejaLlaves", prmRegistro.getDejaLlaves());
        jsonObj.addProperty("Observaciones", prmRegistro.getObservaciones());
        jsonObj.addProperty("IdParqueadero", prmRegistro.getIdParqueadero());
        jsonObj.addProperty("EntregaFicha", prmRegistro.getEntregaFicha());
        jsonObj.addProperty("IdRegistro", prmRegistro.getIdRegistroParqueo());
        return jsonObj.toString();
    }

    /**
     * Realiza el parse de un objeto vehiculo a un objeto JSON
     *
     * @param prmVehiculo objeto vehiculo
     * @return String
     *
     */
    public String parseToJSON(Vehiculo prmVehiculo) {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("Placa", prmVehiculo.getPlaca());
        jsonObj.addProperty("TipoVehiculo", prmVehiculo.getTipoVehiculo());
        return jsonObj.toString();
    }

    /**
     * Realiza el parse de un objeto usuario a un objeto JSON
     *
     * @param prmUser objeto usuario
     * @return String
     *
     */
    public String parseToJSON(clsUsuario prmUser) {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("Cedula", prmUser.getAtrCedula());
        jsonObj.addProperty("Nombres", prmUser.getAtrNombres());
        jsonObj.addProperty("Apellidos", prmUser.getAtrApellidos());
        jsonObj.addProperty("Rol", prmUser.getAtrRol());
        jsonObj.addProperty("Login", prmUser.getAtrLogin());
        jsonObj.addProperty("Password", prmUser.getAtrPassword());
        return jsonObj.toString();
    }

    /**
     * Realiza el parse de un objeto factura a un objeto JSON
     *
     * @param prmFactura objeto tipo factura
     * @return String
     *
     */
    public String parseToJSON(clsFactura prmFactura) {
        JsonObject jsonObj = new JsonObject();
        jsonObj.addProperty("ID", prmFactura.getId());
        jsonObj.addProperty("IdRegistro", prmFactura.getIdRegistroParqueo());
        jsonObj.addProperty("valorApagar", prmFactura.getValorApagar());
        return jsonObj.toString();
    }

    /**
     * Realiza el parse de un objeto JSON a un objeto factura
     *
     * @param prmJSONFactura
     * @return objeto factura
     *
     */
    public clsFactura parseToFactura(String prmJSONFactura) {
        clsFactura objFactura = new clsFactura();
        Gson gson = new Gson();
        Properties properties = gson.fromJson(prmJSONFactura, Properties.class);
        objFactura.setId(properties.getProperty("ID"));
        objFactura.setRegistroParqueo(properties.getProperty("IdRegistro"));
        objFactura.setValorApagar(properties.getProperty("valorApagar"));
        return objFactura;
    }

    /**
     * Realiza el parse de un objeto JSON a un objeto usuario
     *
     * @param prmJSONUser
     * @return objeto usuario
     *
     */
    public clsUsuario parseToUsuario(String prmJSONUser) {
        clsUsuario objUser = new clsUsuario();
        Gson gson = new Gson();
        Properties properties = gson.fromJson(prmJSONUser, Properties.class);
        objUser.setAtrCedula(properties.getProperty("Cedula"));
        objUser.setAtrNombres(properties.getProperty("Nombres"));
        objUser.setAtrApellidos(properties.getProperty("Apellidos"));
        objUser.setAtrRol(properties.getProperty("Rol"));
        objUser.setAtrLogin(properties.getProperty("Login"));
        objUser.setAtrPassword(properties.getProperty("Password"));
        return objUser;
    }

    /**
     * Realiza el parse de un objeto JSON a un objeto vehiculo
     *
     * @param prmJSONVehiculo
     * @return objeto vehiculo
     *
     */
    public Vehiculo parseToVehiculo(String prmJSONVehiculo) {
        Vehiculo objVehiculo = new Vehiculo();
        Gson gson = new Gson();
        Properties properties = gson.fromJson(prmJSONVehiculo, Properties.class);
        objVehiculo.setPlaca(properties.getProperty("Placa"));
        objVehiculo.setTipoVehiculo(properties.getProperty("TipoVehiculo"));
        return objVehiculo;
    }

    /**
     * Realiza el parse de un objeto JSON a una lista de parqueadero
     *
     * @param prmJSONParqueadero
     * @return lista de parqueaderos
     *
     */
    public List<Parqueadero> parseToParqueaderos(String prmJSONParqueadero) {
        List<Parqueadero> objParqueaderos = new ArrayList();
        int i = 1;
        try {
            Gson gson = new Gson();
            Properties properties = gson.fromJson(prmJSONParqueadero, Properties.class);
            while (true) {
                objParqueaderos.add(parseToParqueadero(properties.getProperty(String.valueOf(i))));
                i++;
            }
        } catch (Exception e) {
            System.out.println("Eror: " + e.getMessage());
        }
        return objParqueaderos;
    }

    /**
     * Realiza el parse de un objeto JSON a un objeto parqueadero
     *
     * @param prmJSONParqueadero
     * @return objeto parqueadero
     *
     */
    public Parqueadero parseToParqueadero(String prmJSONParqueadero) {
        Parqueadero objParqueadero = new Parqueadero();
        Gson gson = new Gson();
        Properties properties = gson.fromJson(prmJSONParqueadero, Properties.class);
        objParqueadero.setNombre(properties.getProperty("NombreParqueadero"));
        objParqueadero.setDireccion(properties.getProperty("Direccion"));
        objParqueadero.setTelefono(properties.getProperty("Telefono"));
        objParqueadero.setId(properties.getProperty("IDParqueadero"));
        return objParqueadero;
    }
    /**
     * Descerializa una lista de estadisticas en JSON
     *
     * @param prmJSONEstadisticas Lista estadisticas en JSON
     * @return Lista Estadisticas
     */
    public List<clsEstadisticas> parseToEstadisticas(String prmJSONEstadisticas) {
        List<clsEstadisticas> objEstadistica = new ArrayList();
        int i = 1;
        try {
            Gson gson = new Gson();
            Properties properties = gson.fromJson(prmJSONEstadisticas, Properties.class);
            while (true) {
                objEstadistica.add(parseToEstadistica(properties.getProperty(String.valueOf(i))));
                i++;
            }
        } catch (Exception e) {
            System.out.println("Eror: " + e.getMessage());
        }
        return objEstadistica;
    }
     /**
     * Descerializa una estadistica JSON
     *
     * @param prmJSONEstadistica Estadistica JSON
     * @return Objeto estadistica
     */
    public clsEstadisticas parseToEstadistica(String prmJSONEstadistica) {
        clsEstadisticas objEstadistica = new clsEstadisticas();
        Gson gson = new Gson();
        Properties properties = gson.fromJson(prmJSONEstadistica, Properties.class);
        objEstadistica.setHora(properties.getProperty("Hora"));
        objEstadistica.setNumeroEntradas(properties.getProperty("NumeroIngresos"));
        return objEstadistica;
    }
    
    /**
     * Realiza el parse de un objeto JSON a un objeto registro parqueo
     *
     * @param prmJSONRegistro
     * @return objeto registro parqueo
     *
     */
    public clsRegistroParqueo parseToRegistroParqueo(String prmJSONRegistro) {
        clsRegistroParqueo objRegistro = new clsRegistroParqueo();
        Gson gson = new Gson();
        Properties properties = gson.fromJson(prmJSONRegistro, Properties.class);
        objRegistro.setUsuario(parseToUsuario(properties.getProperty("Usuario")));
        objRegistro.setVehiculo(parseToVehiculo(properties.getProperty("Vehiculo")));
        objRegistro.setAtrCodigoBarras(properties.getProperty("CodigoBarras"));
        objRegistro.setNombresApellidosProp(properties.getProperty("NombresApellidosProp"));
        objRegistro.setFechaHoraEntrada(properties.getProperty("FechaHoraEntrada"));
        objRegistro.setFechaHoraSalida(properties.getProperty("FechaHoraSalida"));
        objRegistro.setNumeroCascos(properties.getProperty("NumeroCascos"));
        objRegistro.setNumeroCasillero(properties.getProperty("NumeroCasillero"));
        objRegistro.setDejaLlaves(properties.getProperty("DejaLlaves"));
        objRegistro.setAtrObservaciones(properties.getProperty("Observaciones"));
        objRegistro.setAtrIdParqueadero(properties.getProperty("IdParqueadero"));
        objRegistro.setEntregaFicha(properties.getProperty("EntregaFicha"));
        objRegistro.setIdRegistroParqueo(properties.getProperty("IdRegistro"));
        return objRegistro;
    }
}
