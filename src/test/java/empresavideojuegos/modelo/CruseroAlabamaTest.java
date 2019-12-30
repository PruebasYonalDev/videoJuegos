package empresavideojuegos.modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CruseroAlabamaTest {

    CruseroAlabama c;

    @Before
    public void setUp() throws Exception {
        c = new CruseroAlabama("barco",200);
    }

    @Test
    public void conts() {
        Assert.assertNotNull("El dato no es el esperado",c);
    }
}