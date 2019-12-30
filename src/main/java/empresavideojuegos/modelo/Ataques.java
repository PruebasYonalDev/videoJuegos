package empresavideojuegos.modelo;

public class Ataques {

    Vehiculo cruseroAlabama = new Vehiculo("barco", 2, 2000);
    Vehiculo bombasrderoB56 = new Vehiculo("avion", 1, 20);
    Vehiculo camionHl = new Vehiculo("avion", 1, 5);
    Vehiculo motoHarley = new Vehiculo("avion", 1, 0);
    Vehiculo jeep = new Vehiculo("avion", 1,0);
    Vehiculo portaAviones = new Vehiculo("avion", 1, 3000);
    Vehiculo speedFighter = new Vehiculo("avion", 1,1);
    Vehiculo tanqueSherman = new Vehiculo("avion", 1,1);

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



}
