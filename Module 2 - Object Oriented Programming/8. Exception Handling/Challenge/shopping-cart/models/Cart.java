package models;

import java.util.ArrayList;

public class Cart {

    ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }
    
    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.set(index, new Item(item));
    }




   /**
    * Name: add
    * @param item
    * @return boolean
    *
    * Inside the function:
    *   1. Adds an item to the cart if it wasn't already added.
    */
    public boolean add(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (this.items.contains(item)) {
                return false;
            }
        }
        this.items.add(new Item(item));
        return true;
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

 
 
  
   /**
    * Name: remove
    * @param name
    *
    * Inside the function:
    *   1. Removes the item that matches the name passed in.
    */
    public void remove(String name) {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("cart is empty");
        }
        for (int i = 0; i < this.items.size(); i++) {
            if (this.items.get(i).getName().equalsIgnoreCase(name)) {
                items.remove(i);
            }
        }
    }

    
 
  
   /**
    *  Name: checkout
 * @return 
    *  @return (String)
    *
    *  Inside the function:
    *   1. Calculates the subtotal (price before tax).
    *   2. Calculates the tax (assume tax is 13%).
    *   3. Calculates total: subtotal + tax
    *   4. Returns a String that resembles a receipt. See below.
    */
    public String checkout() {
        if (this.items.isEmpty()) {
            throw new IllegalStateException("cart is empty");
        }
        String temp = "\tRECEIPT\n\n";
        double subtotal = 0;
        for (int i = 0; i < items.size(); i++) {
            subtotal += items.get(i).getPrice();
            temp += "\t" + items.get(i).toString() + "\n";
        }
        double tax = subtotal * 0.13;
        temp += "\n\tSubtatal: $" + subtotal + "\n" +
        "\tTax: $" + tax + "\n" +
        "\tTotal: $" + (subtotal + tax) + "\n";
        return temp;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString() + "\n";
        }
        return temp;
    }
    
}
