import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter two intergers (on the same line)");
        // int num1 = scan.nextInt();
        // int num2 = scan.nextInt();

        // System.out.println("Enter two very big intergers (on the same line)");
        // long bigNum1 = scan.nextLong();
        // long bigNum2 = scan.nextLong();

        // System.out.println("Enter two decimals (on the same line)");
        // double decimal1 = scan.nextDouble();
        // double deciaml2 = scan.nextDouble();

        // System.out.println("Enter two text values (on the same line)");
        // String text1 = scan.next();
        // String text2 = scan.next();

        System.out.println("Please enter a number");
        int num = scan.nextInt();
        System.out.println("Please enter a sentence");
        scan.nextLine();
        String text = scan.nextLine();
        scan.close();

        System.out.println("You wrote: " + num + " and " + text);

        // System.out.println("\tIntegers: " + num1 + " " + num2);
        // System.out.println("\tBig Integers: " + bigNum1 + " " + bigNum2);
        // System.out.println("\tDecimals: " + decimal1 + " " + deciaml2);
        // System.out.println("\tWords: " + text1 + " " + text2);

        }
}
