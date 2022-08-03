import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        
        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        };

        Machine machine = new Machine(items);

        // System.out.println(machine);

        Scanner scan = new Scanner(System.in);

        

        System.out.println("\n" + machine);

        

        while (true) {
            System.out.print("Pick a row: "); 
            int row = scan.nextInt();
            System.out.print("Pick a spot in the row: "); 
            int spot = scan.nextInt();
            boolean dispensed = machine.dispense(row, spot);
            System.out.println("\n" + machine);

            if (dispensed) {
                System.out.print("\nEnjoy your drink! Press 1 to purchase another: ");
            } else {
                System.out.print("\nSorry, we're out of this item. Press 1 to purchase another: ");
            }
            
            if (scan.nextInt() != 1) {
                break;
            }
            
        }

        scan.close();;


        // Item item = new Item("Pepsi", 1.99, 3);
        // System.out.println(item);

        // Item newCoke = machine.getItem(2, 1);
        // newCoke.setPrice(2.49);
        // machine.setItem(newCoke, 2, 1);

        // items[2][1].setPrice(2.99);
        // System.out.println(machine.getItem(2, 1));

        // machine.getItem(2, 1).setPrice(2.99);
        // System.out.println(items[2][1]);

        // machine.dispense(0, 0);
        // machine.dispense(0, 0);
        // System.out.println(machine.getItem(0, 0));

        // System.out.println(machine);
        



        

    }
}
