package Patterns;
import java.util.Scanner;

public class traingle_0_1 {
    public static void main(String[] args) {
        int rows;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = obj.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // System.out.print(((i + j) % 2) + " ");
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
