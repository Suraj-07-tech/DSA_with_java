import java.util.*;

public class replace_odd_elements_by_their_squares {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size;
        System.out.print("Enter size of array : ");
        size = obj.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter elements in array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println("The Normal array is : ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
            if (arr[i] % 2 == 1) {
                arr[i] = arr[i] * arr[i];
            }
        }
        System.out.println("The array after replacing odd elements by their squares is : ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }

}
