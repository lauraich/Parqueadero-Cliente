/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.negocio;

import co.unicauca.parqueadero.acceso.FacturacionServicioImplSockets;
import co.unicauca.parqueadero.acceso.IFacturacionServicio;

/**
 *
 * @author Usuario
 */
public class clsGestorFacturacion {
    IFacturacionServicio factura;

    public clsGestorFacturacion() {
        this.factura = new FacturacionServicioImplSockets();
    }
    public boolean registrarFactura(clsFactura prmFactura)throws Exception{
        return factura.registrarFactura(prmFactura);
    }
    public String totalPagar(String tipoVehiculo,String prmDias,String prmHoras,String prmMinutos) throws Exception{
        return factura.totalPagar(tipoVehiculo,prmDias,prmHoras,prmMinutos);
    }
    
}
