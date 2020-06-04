/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.acceso;

/**
 *
 * @author Usuario
 */
public interface ILoginServicio {

    public boolean login(String usuario, String contraseña) throws Exception;
}
