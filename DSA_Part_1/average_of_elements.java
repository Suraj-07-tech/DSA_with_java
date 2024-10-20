import java.util.Scanner;

public class average_of_elements {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size, sum;
        sum = 0;
        System.out.println("Enter size of array : ");
        size = obj.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements in array one by one : ");
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
            sum += arr[i];
        }
        System.out.println("*******\nThe Sum is :" + sum + "\nThe average is : " + ((double) sum / size));
        obj.close();
    }
}
