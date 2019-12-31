package empresavideojuegos.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpeedFighterTest {

    SpeedFighter s;

    @Before
    public void setUp() throws Exception {
        s = new SpeedFighter("avion",1,1,1);
    }

    @Test
    public void conts() {
        Assert.assertNotNull("El dato no es el esperado",s);
    }
}