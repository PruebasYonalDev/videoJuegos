package empresavideojuegos.modelo;

import java.util.ArrayList;

public class Ataque {

    Vehiculo cruseroAlabama = new Vehiculo("barco", 2, 2000,3);
    Vehiculo bombasrderoB56 = new Vehiculo("avion", 1, 20,3);
    Vehiculo camionHl = new Vehiculo("avion", 1, 5,0);
    Vehiculo motoHarley = new Vehiculo("avion", 1, 0,0);
    Vehiculo jeep = new Vehiculo("avion", 1,0,1);
    Vehiculo portaAviones = new Vehiculo("avion", 1, 3000,0);
    Vehiculo speedFighter = new Vehiculo("avion", 1,1,1);
    Vehiculo tanqueSherman = new Vehiculo("avion", 1,1,1);

    public void ataqueMasivoAmetralladora() {

        PortaAviones portaaviones = new PortaAviones("barco", 200, 50,1);
        SpeedFighter s = new SpeedFighter("avion", 1, 1,2);
        TanqueSherman t = new TanqueSherman("tanque", 1, 2,3);


        ArrayList<Rafagable> vehiculosRafagabla = new ArrayList<Rafagable>();
        vehiculosRafagabla.add(portaaviones);
        vehiculosRafagabla.add(s);
        vehiculosRafagabla.add(t);

        for (Rafagable vr :
                vehiculosRafagabla) {
            vr.dorafaga();
        }
    }

    public void ataqueMasivoBombarderos() {
        PortaAviones portaaviones = new PortaAviones("barco", 200, 50,3);
        SpeedFighter s = new SpeedFighter("avion", 1, 1,2);
        TanqueSherman t = new TanqueSherman("tanque", 1, 2,3);
        BombarderoB56 b = new BombarderoB56("avion", 1, 1,3);


        ArrayList<Bombardable> vehiculosBombardable = new ArrayList<Bombardable>();
        vehiculosBombardable.add(portaaviones);
        vehiculosBombardable.add(s);
        vehiculosBombardable.add(t);
        vehiculosBombardable.add(b);

        for (Bombardable vr :
                vehiculosBombardable) {
            vr.doBombardear();
        }
    }

    public int cantidadPersonas() {

        int ncruseroAlabama = cruseroAlabama.getNumeroPersonas();
        int nbombasrderoB56 = bombasrderoB56.getNumeroPersonas();
        int ncamionHl = camionHl.getNumeroPersonas();
        int nmotoHarley = motoHarley.getNumeroPersonas();
        int njeep = jeep.getNumeroPersonas();
        int nportaAviones = portaAviones.getNumeroPersonas();
        int nspeedFighter = speedFighter.getNumeroPersonas();
        int ntanqueSherman = tanqueSherman.getNumeroPersonas();

        int totalPersonas = nbombasrderoB56+ncamionHl+ncruseroAlabama+njeep+nmotoHarley+nportaAviones+nspeedFighter+ntanqueSherman;

        return totalPersonas;

    }

    public int cantidadToneladas() {
        int ncruseroAlabama = cruseroAlabama.getPesoCapacidad();
        int nbombasrderoB56 = bombasrderoB56.getPesoCapacidad();
        int ncamionHl = camionHl.getPesoCapacidad();
        int nmotoHarley = motoHarley.getPesoCapacidad();
        int njeep = jeep.getPesoCapacidad();
        int nportaAviones = portaAviones.getPesoCapacidad();
        int nspeedFighter = speedFighter.getPesoCapacidad();
        int ntanqueSherman = tanqueSherman.getPesoCapacidad();

        int totaltoneladas = nbombasrderoB56+ncamionHl+ncruseroAlabama+njeep+nmotoHarley+nportaAviones+nspeedFighter+ntanqueSherman;

        return totaltoneladas;
    }

    public static void main(String[] args) {
        Ataque a = new Ataque();
        a.ataqueMasivoAmetralladora();
        a.ataqueMasivoBombarderos();
    }


}
