/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parqueadero.negocio;
import co.unicauca.parqueadero.acceso.EntradaServicioImplSockets;
import co.unicauca.parqueadero.acceso.IRegistroParqueo;
/**
 *
 * @author Usuario
 */
public class GestorEntrada {
    IRegistroParqueo RegistroEntrada;

    public GestorEntrada() {
        RegistroEntrada = new EntradaServicioImplSockets();
    }
    public boolean registrarEntrada(clsRegistroParqueo registro) throws Exception{
        return RegistroEntrada.registrarEntrada(registro);
    }
    
}
