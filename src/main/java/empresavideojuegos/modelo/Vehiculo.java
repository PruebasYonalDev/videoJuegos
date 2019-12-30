package empresavideojuegos.modelo;

public class Vehiculo {

    private String tipoVehiculo;
    private int numeroPersonas;
    private int pesoCapacidad;


    public Vehiculo(String tipoVehiculo, int numeroPersonas, int pesoCapacidad) {
        this.tipoVehiculo = tipoVehiculo;
        this.numeroPersonas = numeroPersonas;
        this.pesoCapacidad = pesoCapacidad;
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
