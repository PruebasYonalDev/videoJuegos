package empresavideojuegos.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeepTest {

    Jeep j;

    @Before
    public void setUp() throws Exception {
        j = new Jeep("carro",5,1,1);
    }

    @Test
    public void conts() {
        Assert.assertNotNull("El dato no es el esperado",j);
    }
}