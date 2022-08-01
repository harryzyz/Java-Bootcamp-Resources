import java.nio.file.FileSystemLoopException;
import java.nio.file.FileSystemLoopException;
import java.util.Arrays;

public class TDArrays {
    public static void main(String[] args) {
        // int[][] grades = new int[3][4];
        // grades[0][0] = 72;
        int[][] grades = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100},
        };
        // System.err.println("\tHarry: " + Arrays.toString(grades[0]));
        // System.err.println("\tRon: " + Arrays.toString(grades[1]));
        // System.err.println("\tHermione: " + Arrays.toString(grades[2]));

        for (int i = 0; i < grades.length; i++) {
            switch (i) {
                case 0: System.out.print("\tHarry: "); break;
                case 1: System.out.print("\tRon: "); break;
                case 2: System.out.print("\tHermione: "); break;
                default: break;
            }
            
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println("\n");
        }
        
    }
}
