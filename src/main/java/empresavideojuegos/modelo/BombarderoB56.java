package empresavideojuegos.modelo;


public class BombarderoB56 extends Vehiculo implements Bombardable {
    public BombarderoB56(String tipoVehiculo, int numeroPersonas, int pesoCapacidad, int municion) {
        super(tipoVehiculo, numeroPersonas, pesoCapacidad, municion);
    }

    public void doBombardear() {
        int m = super.getMunicion();
        m--;
        if (m == 0){
            System.out.println("tu municion ha terminado BOMBARDEROB56 ");
        }
        System.out.println("bombardeo desde BOMBARDEROB56");
    }
}
