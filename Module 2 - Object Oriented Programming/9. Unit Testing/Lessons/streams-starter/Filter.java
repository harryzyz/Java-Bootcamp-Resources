import java.util.ArrayList;

import javax.sql.rowset.spi.SyncResolver;

public class Filter {

    static ArrayList<Double> prices = new ArrayList<Double>();


    public static void main(String[] args) {
        prices.add(1.99);
        prices.add(4.99);
        prices.add(10.99);
        prices.add(15.99);

        prices.stream()
            .filter((price) -> {
                return price <5;
            })
            .forEach((price) -> {
                System.out.println(price);
            });

        prices.stream()
            .filter((price) -> price < 5)
            .forEach((price) -> System.out.println(price));

        filterLowPrices();

    }

    public static void filterLowPrices() {
        System.out.println("\n\nLOW PRICES");
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) < 5) {
                System.out.println(prices.get(i)); 
            }
        }
    }

}
