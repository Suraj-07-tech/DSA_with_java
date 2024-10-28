// Two Different Approaches to find Second largest element in array 
// Both Logic Has Space Complexity : O(1)
// And Time complexity : O(n)

import java.util.Scanner;

public class Second_largest_element {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[] = { 1, 34, 99, 23, 40, 78, 99, 35, 67 };
        Second_largest_element sec = new Second_largest_element();
        int choice;
        System.out.println("Press 1 for My Own Logic \nPress 2 for GFG Logic");
        choice = obj.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The Second Largest is : " + sec.second_largest(arr));
                break;
            case 2:
                System.out.println("The Second Largest is : " + sec.second_largest_by_GFG(arr));
                break;

            default:
                System.out.println("The Second Largest is : " + sec.second_largest_by_GFG(arr));
                break;
        }
    }

    int second_largest(int[] arr) {

        int max = arr[0];
        int max_2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max)
                continue;

            if (arr[i] > max_2)
                max_2 = arr[i];
        }
        return max_2;
    }

    // Two Pass search method
    int second_largest_by_GFG(int[] arr) {
        int max = arr[0];
        int max_2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_2 && arr[i] != max)
                max_2 = arr[i];
        }
        return max_2;
    }
}
