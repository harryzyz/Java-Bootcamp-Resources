import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Movie;
import models.Store;

public class Main {
    static Store store = new Store();

    public static void main(String[] args) {
        System.out.println("\n********************JAVA VIDEO STORE********************\n");
        try {
            loadMovies("movies.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("MOVIES LOADED\n\n");
            System.out.println(store);
            manageMovies();
        }

    }

    /**
     * Name: manageMovies
     * Inside the function:
     * - 1. Starts a new instance of Scanner;
     * - 2. In an infinite loop, the user can choose to a) purchase b) rent c)
     * return d) exit.
     * - case a: ask for the name and sell.
     * - case b: ask for the name and rent.
     * - case c: ask for the name and return.
     * - 3. call close() from the Scanner object.
     */
    public static void manageMovies() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("please choose: a) purchase b) rent c) return d) exit.");
            String choice = scan.nextLine();
            System.out.print("please provide movie name: ");
            String movieName = scan.nextLine();
            if (store.getMovie(movieName) == null) {
                System.out.println("\n\nThe input you provided is not valid. Please try again\n");
                continue;
            }

            if (choice.equals("a")) {
                if (!store.getMovie(movieName).isAvailable()) {
                    System.out.println("\n\n\n\nThe movie is not available for purchase. Please try again\n");
                    continue;
                } else {
                    store.action(movieName, "sell");
                }
            } else if (choice.equals("b")) {
                store.action(movieName, "rent");
            } else if (choice.equals("c")) {
                store.action(movieName, "return");
            } else {
                break;
            }
            System.out.println("\n\n UPDATED MOVIES \n\n");
            System.out.println(store);
        }

        scan.close();
    }

    /**
     * Name: loadMovies
     * 
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     *                               Inside the function:
     *                               - 1. loads movies from <fileName>.txt.
     *                               - 2. adds all movies to the store object's
     *                               movie field.
     *                               Hint: You will need to 'split' a String into
     *                               three Strings.
     */

    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            String[] words = line.split("--");
            store.addMovie(new Movie(words[0], words[1], Double.parseDouble(words[2])));
        }
        scanFile.close();

    }

}
