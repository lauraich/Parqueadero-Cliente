/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsFactura;

/**
 * Interface que define los servicios con el servidor
 *
 */
public interface IFacturacionServicio {

    public boolean registrarFactura(clsFactura prmFactura) throws Exception;

    public String totalPagar(String tipoVehiculo, String prmDias, String prmHoras, String prmMinutos,String prmSegundos) throws Exception;
}
