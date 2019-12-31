package empresavideojuegos.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PortaAvionesTest {

    PortaAviones p;

    @Before
    public void setUp() throws Exception {
        p = new PortaAviones("avion", 2000,1,1);
    }

    @Test
    public void conts() {
        Assert.assertNotNull("El dato no es el esperado",p);
    }
}