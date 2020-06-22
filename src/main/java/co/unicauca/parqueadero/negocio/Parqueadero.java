package co.unicauca.parqueadero.negocio;

/**
 * Representa un parqueadero en la base de datos
 *
 */
public class Parqueadero {

    private String nombre;
    private String direccion;
    private String telefono;
    private String atrId;
    private String puestosDisponiblesCarro;
    private String puestosDisponiblesMoto;

    /**
     * Constructor no parametrizado
     *
     *
     */
    public Parqueadero() {
        this.nombre = "";
        this.direccion = "";
        this.telefono = "";
        atrId = "";
        puestosDisponiblesCarro = "";
        puestosDisponiblesMoto = "";
    }

    /**
     * Constructor parametrizado
     *
     * @param nombre nombre del parqueadero
     * @param telefono telefono del parqueadero
     * @param direccion dirección del parqueadero
     */
    public Parqueadero(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getPuestosDisponiblesMoto() {
        return puestosDisponiblesMoto;
    }

    public void setPuestosDisponiblesMoto(String puestosDisponiblesMoto) {
        this.puestosDisponiblesMoto = puestosDisponiblesMoto;
    }

    public String getPuestosDisponiblesCarro() {
        return puestosDisponiblesCarro;
    }

    public void setPuestosDisponiblesCarro(String puestosDisponibles) {
        this.puestosDisponiblesCarro = puestosDisponibles;
    }

    public String getId() {
        return atrId;
    }

    public void setId(String atrId) {
        this.atrId = atrId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
