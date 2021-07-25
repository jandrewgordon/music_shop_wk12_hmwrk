import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Wood", "Cherry Red", 350.00, 600.00, GuitarType.ELECTRIC, "Stratocaster");
    }

    @Test
    public void canGetMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canPlay(){
        assertEquals("Twang", guitar.play());
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(350, guitar.getBuyPrice(), 0.0);
    }

    @Test
    public void canGetMarkup(){
        assertEquals(250, guitar.calculateMarkup(), 0.0);
    }




}
