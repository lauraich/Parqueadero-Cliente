/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsFacturacion;


public interface IFacturacionServicio {
    public boolean registrarFactura(clsFacturacion prmFactura)throws Exception;
    public String totalPagar(String prmDias,String prmHoras,String prmMinutos) throws Exception;
}
