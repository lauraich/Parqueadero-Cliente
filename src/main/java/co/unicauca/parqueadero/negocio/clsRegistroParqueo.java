package co.unicauca.parqueadero.negocio;

/**
 * Representa un registro de parqueo(Entrada-salida) en la base de datos
 *
 */
public class clsRegistroParqueo {

    private Vehiculo atrVehiculo = null;
    private clsUsuario atrUsuario = null;
    private String atrCodigoBarras = "";
    private String atrNombresApellidosProp = "";
    private String atrFechaHoraEntrada = "";
    private String atrFechaHoraSalida = "";
    private String atrNumeroCascos = "";
    private String atrNumeroCasillero = "";
    private String atrDejaLlaves = "";
    private String atrObservaciones = "";
    private String atrIdParqueadero = "";
    private String atrEntregaFicha = "";
    private String idRegistroParqueo = "";

    /**
     * Constructor parametrizado
     *
     * @param prmUsuario funcionario
     * @param prmVehiculo vehiculo que va a ingresar o salir
     * @param prmCodigoBarras codigo de barras
     * @param prmIdParqueadero identificación del parqueadero
     * @param prmNombresApellidosProp nombre y apellido del propietario del
     * vehiculo
     * @param prmFechaHoraEntrada fecha y hora de entrada
     * @param prmNumeroCascos numero de cascos
     * @param prmNumeroCasillero casillero en el cual dejan los cascos
     * @param prmDejaLlaves deja llaves el cliente
     * @param prmObservaciones observaciones
     */
    public clsRegistroParqueo(clsUsuario prmUsuario, Vehiculo prmVehiculo, String prmCodigoBarras, String prmIdParqueadero, String prmNombresApellidosProp, String prmFechaHoraEntrada, String prmNumeroCascos, String prmNumeroCasillero, String prmDejaLlaves, String prmObservaciones) {
        this.atrUsuario = prmUsuario;
        atrVehiculo = prmVehiculo;
        atrCodigoBarras = prmCodigoBarras;
        atrIdParqueadero = prmIdParqueadero;
        this.atrNombresApellidosProp = prmNombresApellidosProp;
        this.atrFechaHoraEntrada = prmFechaHoraEntrada;
        this.atrNumeroCascos = prmNumeroCascos;
        this.atrNumeroCasillero = prmNumeroCasillero;
        this.atrDejaLlaves = prmDejaLlaves;
        atrObservaciones = prmObservaciones;
    }

    /**
     * Constructor no parametrizado
     */
    public clsRegistroParqueo() {
    }

    public String getIdRegistroParqueo() {
        return idRegistroParqueo;
    }

    public void setIdRegistroParqueo(String prmIdRegistroParqueo) {
        this.idRegistroParqueo = prmIdRegistroParqueo;
    }

    public String getIdParqueadero() {
        return atrIdParqueadero;
    }

    public void setAtrIdParqueadero(String prmIdParqueadero) {
        this.atrIdParqueadero = prmIdParqueadero;
    }

    public String getObservaciones() {
        return atrObservaciones;
    }

    public void setAtrObservaciones(String prmObservaciones) {
        this.atrObservaciones = prmObservaciones;
    }

    public String getDejaLlaves() {
        return atrDejaLlaves;
    }

    public void setDejaLlaves(String prmDejaLlaves) {
        this.atrDejaLlaves = prmDejaLlaves;
    }

    public Vehiculo getVehiculo() {
        return atrVehiculo;
    }

    public void setVehiculo(Vehiculo prmVehiculo) {
        this.atrVehiculo = prmVehiculo;
    }

    public clsUsuario getUsuario() {
        return atrUsuario;
    }

    public void setUsuario(clsUsuario prmUsuario) {
        this.atrUsuario = prmUsuario;
    }

    public String getCodigoBarras() {
        return atrCodigoBarras;
    }

    public void setAtrCodigoBarras(String prmCodigoBarras) {
        this.atrCodigoBarras = prmCodigoBarras;
    }

    public String getNombresApellidosProp() {
        return atrNombresApellidosProp;
    }

    public void setNombresApellidosProp(String prmNombresApellidosProp) {
        this.atrNombresApellidosProp = prmNombresApellidosProp;
    }

    public String getFechaHoraEntrada() {
        return atrFechaHoraEntrada;
    }

    public void setFechaHoraEntrada(String prmFechaHoraEntrada) {
        this.atrFechaHoraEntrada = prmFechaHoraEntrada;
    }

    public String getFechaHoraSalida() {
        return atrFechaHoraSalida;
    }

    public void setFechaHoraSalida(String prmFechaHoraSalida) {
        this.atrFechaHoraSalida = prmFechaHoraSalida;
    }

    public String getNumeroCascos() {
        return atrNumeroCascos;
    }

    public void setNumeroCascos(String prmNumeroCascos) {
        this.atrNumeroCascos = prmNumeroCascos;
    }

    public String getNumeroCasillero() {
        return atrNumeroCasillero;
    }

    public void setNumeroCasillero(String prmNumeroCasillero) {
        this.atrNumeroCasillero = prmNumeroCasillero;
    }

    public String getEntregaFicha() {
        return atrEntregaFicha;
    }

    public void setEntregaFicha(String atrDejaFicha) {
        this.atrEntregaFicha = atrDejaFicha;
    }

}
