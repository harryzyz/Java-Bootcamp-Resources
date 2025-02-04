package models;

import java.util.Objects;

public class Shirt extends Product {
    
    public enum Size {
        SMALL, MEDIUM, LARGE
    }
    private Size size;
    

    public Shirt(Size size, double price, String color, String brand) {
        super(price, color, brand);
        this.size = size;
    }

    public Shirt(Shirt source) {
        super(source);
        this.size = source.size;
    }



    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
    


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Shirt)) {
            return false;
        }
        Shirt shirt = (Shirt) o;
        return Objects.equals(size, shirt.size)
            && super.getPrice() == shirt.getPrice()
            && super.getColor().equals(shirt.getColor()) 
            && super.getBrand().equals(shirt.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, super.getPrice(), super.getClass(), super.getBrand());
    }


    @Override
    public String toString() {
        return "SHIRT" +
            "\t size='" + getSize() + "'" +
            "\t price='" + super.getPrice() + "" +
            "\t color='" + super.getColor() + "" +
            "\t brand='" + super.getBrand() + "";
    }

    @Override
    public void fold() {
        System.out.println("Lay shirt on flat surface");
        System.out.println("Fold shirt sideways");
        System.out.println("Bring sleeves in");
        System.out.println("Fold from bottom up");
        
    }

    

// 


    

}
