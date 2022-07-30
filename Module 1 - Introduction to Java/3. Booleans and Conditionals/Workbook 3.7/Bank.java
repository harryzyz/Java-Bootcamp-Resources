import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        //Task 1 - Pick up the user's decision.
        String mortgage = scan.nextLine();
        // System.out.println(mortgage);
        //Task 2 - Print this if the decision is "yes"
        if (mortgage.equals("yes")) {
            System.out.println("\nGreat! In one line" +
            "\nHow much money do you have in your savings?" +
            "\nAnd, how much do you owe in credit card debt?");
            // Task 3 - Pick up each value 
            int savings = scan.nextInt();
            int debt = scan.nextInt();
            System.out.println("\nHow many years have you worked for?");
               // Task 4 - Pick up number of years
            int years = scan.nextInt();

            System.out.println("\nWhat is your name?");
               // Task 5 - Pick up the user's name
            scan.nextLine();
            String name = scan.nextLine();
                
            //Task 6 - Approve the mortgage if they meet the requirements (see article)
            //       - Otherwise, don't give them a mortgage.          
            if ( savings >= 20000 && debt <= 5000 && years >= 2) {
                System.out.println("\nCongratulations " + name + " You have been approved!");
            } else {
                System.out.println("\nSorry, you are not eligible for a mortgage.");
            }
        } else {
            //Task 2 - Print this if the decision was not "yes"
            System.out.println("\nOK. Have a nice day!");
        }

        scan.close();
    }
}