package Patterns;
import java.util.*;

public class fibonacci_series {
    public static void main(String[] args) {
        int first, next, temp, steps;
        first = 0;
        next = 1;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number of steps : ");
        steps = obj.nextInt();
        int i = 1;

        System.out.print(" Your Series is : " + first + " , " + next);
        while (i <= steps - 2) {
            temp = first + next;
            first = next;
            next = temp;
            System.out.print(" , " + next);
            i++;
        }
        obj.close();
    }
}
