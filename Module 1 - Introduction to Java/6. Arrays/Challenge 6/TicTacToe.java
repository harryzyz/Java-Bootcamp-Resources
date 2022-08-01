// import java.lang.reflect.Array;
// import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("\nLet's play tic tac toe");

            //Task 1: Create an array with three rows of '_' characters.
        char[][] board = {
          {'_','_','_'},
          {'_','_','_'},
          {'_','_','_'}
        };


            //Task 2: Call the function printBoard();

        printBoard(board);    
        /*
        {  Task 3: Loop through turns.

            if (X) turn {
                Task 4: call askUser(). 
                Task 5: populate the board using askUser's return value.
            } else {
                Task 4: call askUser(). 
                Task 5: populate the board using askUser's return value. Then, print it.

            }

            Task 6 - Call the function.
                if return value == 3 {
                  print: X wins and break the loop
              } else if return value == -3 {
                  print: O wins and break the loop
              }

          } 
        */
        for (int i = 0; i < 9; i++) {
            char turn = ' ';

            switch (i % 2) {
              case 0: turn = 'X';  break;
              case 1: turn = 'O';  break;          
              default: break;
            }
            System.out.println("Turn: " + turn + "\n");
            int[] move = askUser(board);
            board[move[0]][move[1]] = turn;
            printBoard(board);
            int count = checkWin(board);
            if (count == 3) {
              System.out.println("X wins!");
              break;
            } else if (count == -3) {
              System.out.println("O wins!");
              break;
            } else if (i == 8){
              System.out.println("It is a tie!");;
            }




        }
       
        

        scan.close();
        }


    /** Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     * @param board (char[][])
     * 
     * Inside the function:
     *   1. print a new line.
     *   2. print the board.
     *      - separate each row by two lines. 
     *      - each row precedes a tab of space
     *      - each character in the grid has one space from the other character
     */
    public static void printBoard(char[][] board) {
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            // System.out.print("\n");
            
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n\n");
            }

    }



   /** Task 4 - Write a function that lets the user choose a spot
     * Function name - askUser
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */
    public static int[] askUser(char[][] board) {
        System.out.print("pick a row and column number: ");

        int i = scan.nextInt();
        int j = scan.nextInt();

        while (true) {
          if (i>=0 && i<=2 && j>=0 && j<=2) {
            break;
         } else {
             System.out.print("Invalid number. Choose again: ");
             i = scan.nextInt();
             j = scan.nextInt();
         }
        }

        while (true) {
            if (board[i][j] == '_') {
               break;
            } else {
                System.out.print("Spot taken. Choose again: ");
                i = scan.nextInt();
                j = scan.nextInt();
            }
            
        }
        // int[] choice = {i,j};
        return new int[] {i, j};
    }

    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
    public static int checkWin(char[][] board) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == 'X') && (board[i][1] == 'X') && (board[i][2] == 'X')) {
              count = 3; 
              break;
            }
            if ((board[i][0] == 'O') && (board[i][1] == 'O') && (board[i][2] == 'O')) {
              count = -3; 
              break;
            }
            if ((board[0][i] == 'X') && (board[1][i] == 'X') && (board[2][i] == 'X')) {
              count = 3; 
              break;
            }
            if ((board[0][i] == 'O') && (board[1][i] == 'O') && (board[2][i] == 'O')) {
              count = -3; 
              break;
            }
          }
          
          if ((board[0][0] == 'X') && (board[1][1] == 'X') && (board[2][2] == 'X')) {
            count = 3; 
          }
          if ((board[0][0] == 'O') && (board[1][1] == 'O') && (board[2][2] == 'O')) {
            count = -3; 
          }
          if ((board[0][2] == 'X') && (board[1][1] == 'X') && (board[2][0] == 'X')) {
            count = 3; 
          }
          if ((board[0][2] == 'O') && (board[1][1] == 'O') && (board[2][0] == 'O')) {
            count = -3; 
          }

        
        return count;
    }


}
