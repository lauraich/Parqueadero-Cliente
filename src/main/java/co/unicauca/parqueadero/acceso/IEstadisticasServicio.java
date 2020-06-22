/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsEstadisticas;
import java.util.List;

/**
 * Interface que define los servicios con el servidor
 *
 */
public interface IEstadisticasServicio {

    public List<clsEstadisticas> generarEstadisticas(String fecha, String idParqueadero) throws Exception;
}
