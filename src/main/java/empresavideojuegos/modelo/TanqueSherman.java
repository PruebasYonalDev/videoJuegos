package empresavideojuegos.modelo;

public class TanqueSherman extends Vehiculo implements Rafagable, Bombardable {
    public TanqueSherman(String tipoVehiculo, int numeroPersonas, int pesoCapacidad, int municion) {
        super(tipoVehiculo, numeroPersonas, pesoCapacidad, municion);
    }

    public void dorafaga() {

        int m = super.getMunicion();
        if (m == 0){
            System.out.println("tu municion ha terminado TANQUE");
        }
        System.out.println("Rafaga de ametralladora desde TANQUE");
        m--;

    }

    public void doBombardear() {
        int m = super.getMunicion();
        m--;
        if (m == 0){
            System.out.println("tu municion ha terminado TANQUE SHERMAN ");
        }
        System.out.println("bombardeo desde TANQUE SHERMAN");
    }
}
