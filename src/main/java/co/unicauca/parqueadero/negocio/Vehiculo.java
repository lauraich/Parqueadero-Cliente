package co.unicauca.parqueadero.negocio;

/**
 * Representa un vehiculo en la base de datos
 *
 */
public class Vehiculo {

    private String placa;
    private String tipoVehiculo;

    public Vehiculo() {
        placa="";
        tipoVehiculo="";
    }

    /**
     * Constructor parametrizado
     *
     * @param placa placa del vehiculo
     * @param tipoVehiculo tipo de vehiculo
     */
    public Vehiculo(String placa, String tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

}
