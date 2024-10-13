package Patterns;
import java.util.Scanner;

public class invertedHalfPyramid {
    public static void main(String[] rags) {
        int rows;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = obj.nextInt();

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < rows - i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        obj.close();
    }

}
