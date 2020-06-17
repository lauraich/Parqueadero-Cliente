/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.negocio;

import co.unicauca.parqueadero.acceso.FacturacionServicioImplSockets;
import co.unicauca.parqueadero.acceso.IFacturacionServicio;

/**
 * Fachada con la que se comunica la capa de presentación
 *
 */
public class clsGestorFacturacion {

    IFacturacionServicio factura;

    /**
     * Constructor
     */
    public clsGestorFacturacion() {
        this.factura = new FacturacionServicioImplSockets();
    }

    /**
     * registra la factura correspondiente al pago de la salida de un vehiculo
     *
     * @param prmFactura objeto nuevo de tipo factura que se debe registrar
     * @return Boolean que indica si pudo realizar el registro de la factura
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public boolean registrarFactura(clsFactura prmFactura) throws Exception {
        return factura.registrarFactura(prmFactura);
    }

    /**
     * Calcula el valor a pagar
     *
     * @param tipoVehiculo parametro que contiene el tipo de vehiculo
     * @param prmDias parametro que contiene el número de días transcurridos
     * @param prmHoras parametro que contiene el número de horas transcurridos
     * @param prmMinutos parametro que contiene el número de minutos
     * @param prmSegundos parametro que contiene el número de segundos
     * @return String que contiene el calculo del valor a pagar
     * @throws java.lang.Exception la excepcio se lanza cuando no logra conexión
     * con el servidor
     */
    public String totalPagar(String tipoVehiculo, String prmDias, String prmHoras, String prmMinutos,String prmSegundos) throws Exception {
        return factura.totalPagar(tipoVehiculo, prmDias, prmHoras, prmMinutos,prmSegundos);
    }

}
