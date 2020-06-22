/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.negocio;

import co.unicauca.parqueadero.acceso.EstadisticasServicioImplSockets;
import co.unicauca.parqueadero.acceso.IEstadisticasServicio;
import java.util.List;

/**
 * Fachada con la que se comunica la capa de presentación
 *
 */
public class GestorEstadisticas {

    IEstadisticasServicio estadistica;

    /**
     * Constructor
     */
    public GestorEstadisticas() {
        estadistica = new EstadisticasServicioImplSockets();
    }

    /**
     * Obtiene los datos de los ingresos por hora del parqueadero
     *
     * @param fecha fecha de inserción de los registros
     * @param idParqueadero parqueadero del cual se estan obteniendo los
     * registros
     * @return lista de numero de registros por hora
     * @throws Exception
     */
    public List<clsEstadisticas> generarEstadisticas(String fecha, String idParqueadero) throws Exception {
        return estadistica.generarEstadisticas(fecha, idParqueadero);
    }
}
