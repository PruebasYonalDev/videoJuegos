package empresavideojuegos.modelo;

public class Vehiculo {

    private String tipoVehiculo;
    private int numeroPersonas;

    public Vehiculo(String tipoVehiculo, int numeroPersonas) {
        this.tipoVehiculo = tipoVehiculo;
        this.numeroPersonas = numeroPersonas;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }
}
