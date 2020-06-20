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
 *
 * @author Usuario
 */
public class GestorEstadisticas {
    IEstadisticasServicio estadistica;

    public GestorEstadisticas() {
        estadistica = new EstadisticasServicioImplSockets();
    }
    public List<clsEstadisticas> generarEstadisticas(String fecha,String idParqueadero) throws Exception{
        return estadistica.generarEstadisticas(fecha, idParqueadero);
    }
}
