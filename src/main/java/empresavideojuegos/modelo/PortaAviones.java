package empresavideojuegos.modelo;

public class PortaAviones extends Vehiculo implements Rafagable {
    public PortaAviones(String tipoVehiculo, int numeroPersonas, int pesoCapacidad, int municion) {
        super(tipoVehiculo, numeroPersonas, pesoCapacidad, municion);
    }

    public void dorafaga() {
        int m = super.getMunicion();
        m--;
        if (m == 0){
            System.out.println("tu municion ha terminado PORTA AVIONES ");
        }
        System.out.println("Rafaga de ametralladora desde PORTA AVIONES");
    }
}
