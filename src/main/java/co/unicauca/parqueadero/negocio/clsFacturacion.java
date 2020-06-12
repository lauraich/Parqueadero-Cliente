
package co.unicauca.parqueadero.negocio;

/**
 *
 * @author Usuario
 */
public class clsFacturacion {
    
    private String idFacturacion;
    private String valorApagar;

    public clsFacturacion() {
        
    }

    public clsFacturacion(String valorApagar) {
        this.valorApagar = valorApagar;
    }

    public String getIdFacturacion() {
        return idFacturacion;
    }

    public void setIdFacturacion(String idFacturacion) {
        this.idFacturacion = idFacturacion;
    }

    public String getValor() {
        return valorApagar;
    }

    public void setValor(String valor) {
        this.valorApagar = valor;
    }
        
}
