import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        String[] parts = {"tires", "keys"};

        Car nissan = new Car("Nissan", 5000, 2020, "red", parts);
        
        Car dodge = new Car("Dodge", 11000, 2019, "blue", parts);

        Car nissan2 = new Car(nissan);
        
        nissan2.setColor("yellow");
        nissan2.setParts(new String[] {"tires", "filter"});

        Dealership dealership = new Dealership();

        // System.out.println(nissan);



        // System.out.println(Arrays.toString(nissan2.getParts()));


        // nissan.drive();
        // dodge.drive();
        // nissan2.drive();
        // dodge.setColor("jet black");


        // nissan.setPrice(nissan.getPrice() / 2);

        // dodge.setPrice(dodge.getPrice() / 2);

        // System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");

        // System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");

        // System.out.println("This " + nissan2.getMake() + " is worth $" + nissan2.getPrice() + ". It was built in " + nissan2.getYear() + ". It is " + nissan2.getColor() + ".\n");

    }
}