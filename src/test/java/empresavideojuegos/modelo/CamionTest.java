package empresavideojuegos.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CamionTest {

    Camion c;

    @Before
    public void setUp() throws Exception {
        c = new Camion("carro",5,1);
    }

    @Test
    public void conts() {
        Assert.assertNotNull("El dato no es el esperado",c);
    }
}