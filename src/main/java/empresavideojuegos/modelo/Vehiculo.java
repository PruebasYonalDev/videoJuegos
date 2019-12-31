package empresavideojuegos.modelo;

public class Vehiculo {

    private String tipoVehiculo;
    private int numeroPersonas;
    private int pesoCapacidad;
    private int municion;

    public int getMunicion() {
        return municion;
    }

    public Vehiculo(String tipoVehiculo, int numeroPersonas, int pesoCapacidad, int municion) {
        this.tipoVehiculo = tipoVehiculo;
        this.numeroPersonas = numeroPersonas;
        this.pesoCapacidad = pesoCapacidad;
        this.municion = municion;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public int getPesoCapacidad() {
        return pesoCapacidad;
    }
}
