package empresavideojuegos.modelo;



public class Ataques {

    Vehiculo cruseroAlabama = new Vehiculo("barco", 2);
    Vehiculo bombasrderoB56 = new Vehiculo("avion", 1);
    Vehiculo camionHl = new Vehiculo("avion", 1);
    Vehiculo motoHarley = new Vehiculo("avion", 1);
    Vehiculo jeep = new Vehiculo("avion", 1);
    Vehiculo portaAviones = new Vehiculo("avion", 1);
    Vehiculo speedFighter = new Vehiculo("avion", 1);
    Vehiculo tanqueSherman = new Vehiculo("avion", 1);

    public int ataqueMasivo() {

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

    public static void main(String[] args) {
        Ataques p = new Ataques();
        p.ataqueMasivo();

    }



}
