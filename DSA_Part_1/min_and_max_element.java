import java.util.*;

public class min_and_max_element {
    public static void main(String[] args) {
        int arr[] = new int[6];
        int max = 0;
        int min = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter elements in Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Digit in array is : " + max);
        System.out.println("Minimum Digit in array is : " + min);
        obj.close();
    }
}
