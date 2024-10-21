import java.util.Scanner;

public class average_odd_elements {

    public static void main(String[] args) {
        int size, odd_count;
        odd_count = 0;
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        size = obj.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements in array ");
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
            if (!(arr[i] % 2 == 0)) {
                sum += arr[i];
                odd_count++;
            }
        }
        System.out.println("The sum is : " + sum + "\nThe average is : " + ((double) sum / odd_count));
        obj.close();
    }
}
