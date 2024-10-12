// This a pattern to print using java 

import java.io.*;
import java.util.Scanner;

/**
 * solidRectangle
 */
public class solidRectangle {

    public static void main(String[] args) {

        int rows, cols;// Declaring variables for rows and cols
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rows :  ");
        rows = sc.nextInt();// input rows
        System.out.println("Enter Number of Columns :  ");
        cols = sc.nextInt();// input columns

        for (int i = 0; i < rows; i++) {
            // for loop for rows

            for (int j = 0; j < cols; j++) {
                // for loop for columns

                System.out.print("* ");
            }
            System.out.println();// line Change after every Line
        }
        sc.close();
    }
}