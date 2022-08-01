public class Main{
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 5000, 2020, "red");

        
        Car dodge = new Car("Dodge", 11000, 2019, "blue");
        

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() + ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");

        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() + ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");

    }
}