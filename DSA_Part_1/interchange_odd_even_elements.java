// This program interchange the odd elements by their even elements form the array considering that the number of odd and even elements are same

import java.util.Scanner;

public class interchange_odd_even_elements {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array (Even Size only )");
        int size;
        size = obj.nextInt();// Taking input for array size
        if (size % 2 == 0) {
            int arr[] = new int[size];
            int odd[] = new int[size / 2];
            int o = 0;
            int even[] = new int[size / 2];
            int e = 0;
            System.out.println("Enter the elements of the array (Note the odd and even elements must be equal )");
            for (int i = 0; i < size; i++) {
                arr[i] = obj.nextInt();// elements input
                if (arr[i] % 2 == 1) {
                    odd[o] = arr[i];// if odd then assign to odd[] array
                    o++;
                } else {
                    even[e] = arr[i];// if even then assign to even[] array
                    e++;
                }
            }

            // Printing the actual array
            System.out.print("The actual array : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(" " + arr[i]);
            }

            // Checking the odd and even array
            System.out.print("\n\nThe even elements are : ");
            for (int i = 0; i < even.length; i++) {
                System.out.print("  " + even[i]);
            }
            System.out.print("\n\nThe Odd elements are : ");
            for (int i = 0; i < odd.length; i++) {
                System.out.print("  " + odd[i]);
            }

            // Interchanging items
            e = 0;// resetting e =0
            o = 0;// resetting o =0
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 1) {
                    arr[i] = even[e];
                    e++;
                } else {
                    arr[i] = odd[o];
                    o++;
                }
            }

            // Printing the updated array
            System.out.print("\n\nThe Updated array : ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(" " + arr[i]);
            }
        } else {
            System.out.println("Invalid input...\nPlease enter the even size of array ");
        }
        obj.close();
    }
}
