package empresavideojuegos.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AtaqueTest {

    Vehiculo cruseroAlabama;
    Vehiculo bombasrderoB56;
    Vehiculo camionHl;
    Vehiculo motoHarley;
    Vehiculo jeep;
    Vehiculo portaAviones;
    Vehiculo speedFighter;
    Vehiculo tanqueSherman;

    @Before
    public void setUp() throws Exception {
        cruseroAlabama = new Vehiculo("barco", 2,1,1);
        bombasrderoB56 = new Vehiculo("avion", 1,1,1);
        camionHl = new Vehiculo("avion", 1,1,1);
        motoHarley = new Vehiculo("avion", 1,1,1);
        jeep = new Vehiculo("avion", 1,1,1);
        portaAviones = new Vehiculo("avion", 1,1,1);
        speedFighter = new Vehiculo("avion", 1,1,1);
        tanqueSherman = new Vehiculo("avion", 1,1,1);

    }

    @Test
    public void ataqueMasivo() {
        int ncruseroAlabama = cruseroAlabama.getNumeroPersonas();
        int nbombasrderoB56 = bombasrderoB56.getNumeroPersonas();
        int ncamionHl = camionHl.getNumeroPersonas();
        int nmotoHarley = motoHarley.getNumeroPersonas();
        int njeep = jeep.getNumeroPersonas();
        int nportaAviones = portaAviones.getNumeroPersonas();
        int nspeedFighter = speedFighter.getNumeroPersonas();
        int ntanqueSherman = tanqueSherman.getNumeroPersonas();
        int totalPersonas = nbombasrderoB56+ncamionHl+ncruseroAlabama+njeep+nmotoHarley+nportaAviones+nspeedFighter+ntanqueSherman;

        Assert.assertEquals("el dato no es el esperado ",9, totalPersonas);
    }

    @Test
    public void cantidadToneladas() {
        int ncruseroAlabama = cruseroAlabama.getPesoCapacidad();
        int nbombasrderoB56 = bombasrderoB56.getPesoCapacidad();
        int ncamionHl = camionHl.getPesoCapacidad();
        int nmotoHarley = motoHarley.getPesoCapacidad();
        int njeep = jeep.getPesoCapacidad();
        int nportaAviones = portaAviones.getPesoCapacidad();
        int nspeedFighter = speedFighter.getPesoCapacidad();
        int ntanqueSherman = tanqueSherman.getPesoCapacidad();
        int totalToneladas = nbombasrderoB56+ncamionHl+ncruseroAlabama+njeep+nmotoHarley+nportaAviones+nspeedFighter+ntanqueSherman;

        Assert.assertEquals("el dato no es el esperado ",8, totalToneladas);
    }

    @Test
    public void ataqueMasivoAmetralladora() {
    }
}