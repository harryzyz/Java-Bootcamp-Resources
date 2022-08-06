public class Main {
    public static void main(String[] args) {
        Car car = new Car("Nissan", 10000);
        car.setMake("Honda"); //Mutable 
        Car car2 = new Car(car);
        car2.setPrice(8000);

        System.out.println(car.getPrice());
        System.out.println(car2.getPrice());
    }
}
