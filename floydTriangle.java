import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        int rows, traverse_var;
        traverse_var = 1;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = obj.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {

                if (traverse_var < 10) {
                    System.out.print(traverse_var + "   ");
                } else {
                    System.out.print(traverse_var + "  ");
                }
                traverse_var++;
            }
            System.out.println();
        }

    }
}
