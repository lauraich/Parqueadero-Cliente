
package co.unicauca.parqueadero.negocio;

/**
 *
 * @author Usuario
 */
public class clsFactura {
    
    private String idFacturacion="";
    private String valorApagar="";
    private String idRegistroParqueo="";

    public clsFactura() {
        
    }

    public clsFactura(String prmValorApagar,String prmIdRegistroParqueo) {
        this.valorApagar = prmValorApagar;
        this.idRegistroParqueo = prmIdRegistroParqueo;
    }

    public String getIdRegistroParqueo() {
        return idRegistroParqueo;
    }

    public void setRegistroParqueo(String idRegistroParqueo) {
        this.idRegistroParqueo = idRegistroParqueo;
    }

    public void setId(String idRegistroParqueo) {
        this.idRegistroParqueo = idRegistroParqueo;
    }

    public String getId() {
        return idFacturacion;
    }

    public void setIdFacturacion(String idFacturacion) {
        this.idFacturacion = idFacturacion;
    }

    public String getValorApagar() {
        return valorApagar;
    }

    public void setValorApagar(String valor) {
        this.valorApagar = valor;
    }
        
}
