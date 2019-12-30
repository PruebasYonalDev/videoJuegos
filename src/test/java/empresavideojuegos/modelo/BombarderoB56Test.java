package empresavideojuegos.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BombarderoB56Test {

    BombarderoB56 b;

    @Before
    public void setUp() throws Exception {
        b = new BombarderoB56("avion",1);
    }

    @Test
    public void conts() {
        Assert.assertNotNull("El dato no es el esperado",b);
    }
}