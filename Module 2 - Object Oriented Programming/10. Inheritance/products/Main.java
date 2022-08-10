import models.Shirt;
import models.Pants;

public class Main {

    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        Shirt shirt = new Shirt("SMALL", 5.99, "blue", "JAVA VUITTON");
        Pants pants = new Pants(34, 24.99, "black", "JAVA KLEIN");
        Shirt shirt2 = new Shirt(shirt);
        Pants pants2 = new Pants(pants);

        shirt.getPrice();
        shirt.equals(shirt2);
        System.out.println(shirt.hashCode());
        System.out.println(shirt2.hashCode());
    }

/**
 * Function Name: getData
 * 
 * @return Product[]
 * @throws FileNotFoundException
 * 
 *                               Inside the function:
 *                               1. Loads the data from products.txt
 */
}