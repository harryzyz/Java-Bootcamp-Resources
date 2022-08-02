// import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 11000, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 7000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2017, "jet black", new String[] {"tires", "filter","transmission"}),
        };

        Dealership dealership = new Dealership(cars);

        // System.out.println(dealership);

        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        System.out.print("Welcome! Enter the type of car you're looking for: ");
        String make = scan.nextLine();
        System.out.print("Enter your budget: ");
        double budget = scan.nextDouble();
        scan.nextLine();
        
        int carSpot = dealership.search(make, budget);

        if (carSpot == 404) {
            System.out.println("Feel free to browse through our collection of cars.\n");
            System.out.println(dealership);
        } else {
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("yes")){
                dealership.sell(carSpot);
            } else {
                System.out.println("Feel free to browse through our collection of cars.\n");
                System.out.println(dealership);
            }
            
        }

        scan.close();

       

        // dealership.sell(2);
        // System.out.println(dealership);

        

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