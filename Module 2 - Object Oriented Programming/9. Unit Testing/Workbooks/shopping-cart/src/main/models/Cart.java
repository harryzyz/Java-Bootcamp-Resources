package src.main.models;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.stream.IntStream;

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
     * Function name: add
     * @param item 
     * 
     * Inside the function:
     *   1. adds an Item object
     */
    public boolean add(Item item) {
        if (this.items.contains(item)) {
            return false;
        } else {
            items.add(item);
            return true;
        }
        // return true;
    }

    /**
     * Function name: remove
    * @param name
    * 
    * Inside the function:
    *   1. loop runs through the size of the ArrayList.
    *   2. removes the item that matches the name passed in. 
    */
    public void remove(String name) {
        if (items.isEmpty()) {
            throw new IllegalStateException("cannot remove item from an empty cart");
        }
        items.removeIf((item) -> item.getName().equals(name));
    }

    public int getItemIndex(String name) {
        return IntStream.range(0, items.size())
        .filter((i) -> items.get(i).getName().equals(name))
        .findFirst()
        .orElse(-1);
    }

    public double getSubtotal() {
        return this.items.stream()
            .mapToDouble((item) -> item.getPrice())
            .sum();  
    }

    public double getTax(double subtotal) {
        DecimalFormat formatter = new DecimalFormat("#.##");
        return Double.parseDouble(formatter.format(subtotal * 0.13));
    }

    public double getTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    public String checkout() {
        if (items.isEmpty()) {
            throw new IllegalStateException("cannot checkout an empty cart");
        }
        return "\tRECEIPT\n\n" +
        "\tSubtotal: $" + getSubtotal() + "\n" +
        "\tTax: $" + getTax(getSubtotal()) + "\n" +
        "\tTotal: $" + getTotal(getSubtotal(), getTax(getSubtotal())) + "\n";
    }

     /**
  * Function name: contains
  * @param item
  * @return (boolean)
  * 
  * Inside the function:
  *    1. checks if items list contains() item.
  */
    public boolean contains(Item item) {
        return this.items.contains(item);

    }




    
    public String toString() {
        String temp = "";
        for (int i = 0; i < this.items.size(); i++) {
            temp += this.items.get(i).toString();
            temp += "\n";
        }
        return temp;
    }

}
