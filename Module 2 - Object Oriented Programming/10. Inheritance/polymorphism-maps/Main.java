import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // HashMap<Book, String> books = new HashMap<Book, String>();
        // TreeMap<Book, String> books = new TreeMap<Book, String>();
        // LinkedHashMap<Book, String> books = new LinkedHashMap<Book, String>();
        Map<Book, String> books = new TreeMap<Book, String>();


        books.put(new Book("Harry Potter", "J.K. Rowling", 29.99), "SSBob3Bl");
        books.put(new Book("The Catcher in the Rye", "J. D. Salinger", 18.99), "dGhhdCB5b3UncmU=");
        books.put(new Book("Game of Thrones", "George RR Martin", 31.99), "ZW5qb3lpbmc=");
        books.put(new Book("The Alchemist", "Paulo Coelho", 14.99), "dGhlIGNvdXJzZSE=");

        books.size();
        books.isEmpty();
        
        printMap(books);
    }  

    public static void printMap(Map<Book, String> map) {
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        });
    }
}
