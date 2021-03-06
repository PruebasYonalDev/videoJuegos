package empresavideojuegos.modelo;

public class SpeedFighter extends Vehiculo implements Rafagable, Bombardable {
    public SpeedFighter(String tipoVehiculo, int numeroPersonas, int pesoCapacidad, int municion) {
        super(tipoVehiculo, numeroPersonas, pesoCapacidad, municion);
    }

    public void dorafaga() {
        int m = super.getMunicion();
        if (m == 0){
            System.out.println("tu municion ha terminado SPEED FIGHTER");
        }
        System.out.println("Rafaga de ametralladora desde SPEED FIGHTER");
        m--;
    }

    public void doBombardear() {
        int m = super.getMunicion();
        m--;
        if (m == 0){
            System.out.println("tu municion ha terminado SPEED FIGHTER ");
        }
        System.out.println("bombardeo desde SPEED FIGHTER");
    }
}
