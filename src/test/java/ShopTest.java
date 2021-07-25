import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Trumpet trumpet;

    @Before
    public void before(){
        shop = new Shop("Biggars");
        guitar = new Guitar("Fender", "Wood", "Cherry Red", 350.00, 600.00, GuitarType.ELECTRIC, "Stratocaster");
        trumpet = new Trumpet("Yamaha", "Brass", "Gold", 250.00, 400.00);
    }

    @Test
    public void shopHasName(){
        assertEquals("Biggars", shop.getName());
    }

    @Test
    public void shopStartsEmpty(){
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddItem(){
        shop.addItem(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItem(){
        shop.addItem(guitar);
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canCalculateTotalProfit(){
        shop.addItem(guitar);
        shop.addItem(trumpet);
        assertEquals(400.00, shop.totalProfit(), 0.00);
    }
}
