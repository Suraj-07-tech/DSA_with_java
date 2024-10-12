// Rectangle that empty inside

import java.util.*;
import java.io.*;

/**
 * hollowRectangle
 */
public class hollowRectangle {
    public static void main(String[] args) {
        int rows, cols;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        rows = obj.nextInt();
        System.out.print("Enter Number of cols : ");
        cols = obj.nextInt();

        // for (int i = 1; i <= rows; i++) {
        // if (i == 1 || i == rows) {
        // for (int j = 1; j < cols; j++) {
        // System.out.print("* ");
        // }
        // } else {
        // for (int j = 1; j <= cols; j++) {
        // if (j == 1 || j == rows)
        // System.out.print("* ");
        // else
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // The time complexity of both code is : O(rows*cols)
        // The space complexity of both code is : O(1)

        obj.close();
    }

}