/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.transversal;
import co.unicauca.parqueadero.acceso.LoginServicioImplSockets;
import co.unicauca.parqueadero.acceso.ILoginServicio;
/**
 *
 * @author Usuario
 */
public class Seguridad {
    
    public final ILoginServicio login;
    public Seguridad() {
       login = new LoginServicioImplSockets();
    }
    
    public boolean login (String usuario,String contraseña) throws Exception{
        return login.login(usuario, contraseña);
    }
}
