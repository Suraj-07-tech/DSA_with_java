import java.util.Scanner;

public class halfPyramidWithNumbers {
    public static void main(String[] args) {
        int rows;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = obj.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        obj.close();
    }
}
