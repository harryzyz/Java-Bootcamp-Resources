import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        scan.close();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers cannot be less than 1. Shutting game down.");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers cannot be greater than 6. Shutting game down.");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;
        System.out.println("Dice sum = " + sumOfDiceRolls + ". Number sum = " + sumOfNumbers + ".");

        

        if (checkWin(sumOfDiceRolls, sumOfNumbers)) {
            System.out.println("Congrats, you win!");
        } else {
            System.out.println("Sorry, you lose.");
        }

    }

    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber++;
        return (int)randomNumber;
    }

    public static boolean checkWin(int sumOfDiceRolls, int sumOfNumbers) {
        return (sumOfDiceRolls < sumOfNumbers && sumOfNumbers - sumOfDiceRolls < 3);

    }
}
