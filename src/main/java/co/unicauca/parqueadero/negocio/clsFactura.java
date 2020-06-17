package co.unicauca.parqueadero.negocio;

/**
 * Representa una factura en la base de datos
 *
 */
public class clsFactura {

    private String idFacturacion = "";
    private String valorApagar = "";
    private String idRegistroParqueo = "";

    /**
     * Constructor no parametrizado
     *
     */
    public clsFactura() {

    }

    /**
     * Constructor parametrizado
     *
     * @param prmValorApagar valor que debe pagar el usuario
     * @param prmIdRegistroParqueo identificador de un registro parqueo
     */
    public clsFactura(String prmValorApagar, String prmIdRegistroParqueo) {
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
