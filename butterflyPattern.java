import java.util.Scanner;

public class butterflyPattern {
    public static void main(String[] args) {
        int rows;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = obj.nextInt();

        for (int i = 1; i <= rows; i++) {
            // for (int j = 1; j < rows; j++) {
            while (i <= rows / 2) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                for (int m = 1; m <= (rows - (i * 2)); m++) {
                    System.out.print("  ");
                }
                for (int n = 1; n <= i; n++) {
                    System.out.print("* ");
                }
            }
            while (i > rows / 2) {
                for (int k = 1; k <= i / 2; k++) {
                    System.out.print("* ");
                }
                for (int m = 1; m <= (rows - (i / 2 * 2)); m++) {
                    System.out.print("  ");
                }
                for (int n = 1; n <= i / 2; n++) {
                    System.out.print("* ");
                }
            }

            // }
            System.out.println();
        }
        obj.close();
    }
}
