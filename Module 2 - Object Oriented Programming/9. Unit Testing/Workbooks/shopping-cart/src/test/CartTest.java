package src.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.main.models.Cart;
import src.main.models.Item;

public class CartTest {

    Cart cart;

    @Before 
    public void setup() {
        cart = new Cart();
        cart.add(new Item("Pepsi", 1.99));
        cart.add(new Item("Crush", 1.99));
    }

    @Test
    public void itemAddedTest() {
        assertTrue(cart.contains(new Item("Crush", 1.99)));
    }

    @Test 
    public void skipDuplcated() {
        assertFalse(cart.add(new Item("Crush", 1.99)));
    }

    @Test
    public void removedItemTest() {
        Item item = new Item("Crush", 1.99);
        cart.remove(item.getName());
        assertFalse(cart.contains(item));
    }

    @Test
    public void subtotalIsValid() {
        assertEquals(3.98, cart.getSubtotal());
    }

    @Test
    public void taxIsValid() {
        assertEquals(0.52, cart.getTax(3.98));
    }

    @Test
    public void totalIsValid() {
        assertEquals(120, cart.getTotal(100, 20));
    }

    @Test(expected = IllegalStateException.class)
    public void invalidRemoveState() {
        cart.clear();
        cart.remove("Pepsi");
    }

    @Test(expected = IllegalStateException.class)
    public void invalidCheckoutState() {
        cart.clear();
        cart.checkout();
    }
    
}
