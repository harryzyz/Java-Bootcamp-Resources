import models.Shirt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import models.Pants;
import models.Product;

public class Main {

    static final String FILE_NAME = "products.txt";

    public static void main(String[] args) {

        try {
            Product[] products = getData();
            Arrays.sort(products);
            for (int i = 0; i < products.length; i++) {
                System.out.println(products[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        



    }

    public static void printArray(Product[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
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
    public static Product[] getData() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        Scanner scanFile = new Scanner(fis);
        Product[] products = new Product[18];
        
        for (int i = 0; scanFile.hasNextLine(); i++) {
            switch (scanFile.next()) {
                case "PANTS":
                    products[i] = new Pants(scanFile.nextInt(), scanFile.nextDouble(), scanFile.next(), scanFile.next());
                    break;
                case "SHIRT":
                    products[i] = new Shirt(Shirt.Size.valueOf(scanFile.next()), scanFile.nextDouble(), scanFile.next(), scanFile.next());
                default:
                    break;
            }
        }
        scanFile.close();
        return products;
    }


}

// Shirt shirt = new Shirt(Shirt.Size.SMALL, 5.99, "blue", "JAVA VUITTON");
// Pants pants = new Pants(34, 24.99, "black", "JAVA KLEIN");
// Shirt shirt2 = new Shirt(shirt);
// Pants pants2 = new Pants(pants);
// Pants pants3 = new Pants(34, 74.99, "blue", "JAVADAS");

// shirt.getPrice();
// shirt.equals(shirt2);
// System.out.println(shirt.hashCode());
// System.out.println(shirt2.hashCode());

// System.out.println(shirt);

// shirt.fold();
// pants.fold();

// pants2.discount();

// System.out.println(pants3.compareTo(pants));