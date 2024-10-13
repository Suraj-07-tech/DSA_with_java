package Patterns;
import java.util.Scanner;

/**
 * invertedHalfPyramid_180_degree
 */
public class invertedHalfPyramid_180_degree {

    public static void main(String[] args) {
        int rows;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = obj.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= (rows - i); j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        obj.close();
    }

}