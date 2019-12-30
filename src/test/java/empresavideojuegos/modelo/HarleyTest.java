package empresavideojuegos.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarleyTest {

    Harley h;

    @Before
    public void setUp() throws Exception {
        h = new Harley("moto",2);
    }

    @Test
    public void conts() {
        Assert.assertNotNull("El dato no es el esperado",h);
    }
}