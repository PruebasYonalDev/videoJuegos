package empresavideojuegos.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VehiculoTest {

    Vehiculo v;

    @Before
    public void setUp() throws Exception {
        v = new Vehiculo("tipo",1);
    }

    @Test
    public void getTipoVehiculo() {
        String tipo = v.getTipoVehiculo();
        Assert.assertEquals("El dato no es el esperado","tipo", tipo);
    }

    @Test
    public void getNumeroPersonas() {
        int numero = v.getNumeroPersonas();
        Assert.assertEquals("El dato no es el esperado",1, numero);
    }
}