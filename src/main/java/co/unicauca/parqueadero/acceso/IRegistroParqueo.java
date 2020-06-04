/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsRegistroParqueo;

/**
 * Interface que define los servicios con el servidor
 *
 */
public interface IRegistroParqueo {

    public boolean registrarEntrada(clsRegistroParqueo prmRegistroParqueo) throws Exception;

    public boolean registrarSalida(clsRegistroParqueo prmRegistroParqueo) throws Exception;

}
