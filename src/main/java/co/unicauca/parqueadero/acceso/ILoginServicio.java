/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.acceso;

import co.unicauca.parqueadero.negocio.clsUsuario;

/**
 * Interface que define los servicios con el servidor
 *
 */
public interface ILoginServicio {

    public boolean login(String usuario, String contraseña) throws Exception;

    public clsUsuario find(String login) throws Exception;
}
