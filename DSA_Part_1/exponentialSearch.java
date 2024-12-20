/* 
1. Start
2. Initialize Array
    Declare arr[] = {1, 2, 3, 4, 5, 6, 45, 67, 89, 100}.
    Read target.
3.  Check if Array is Empty
    Condition: arr.length == 0
    True: Print "Array is empty" → End
    False: Proceed.
4.  Check if Target Matches First Element
    Condition: arr[0] == target
    True: Print "Element present at index 0" → End
    False: Proceed.
    Initialize Bound
5.  Set bound = 1.
    Expand Bound
    Condition: bound < arr.length && arr[bound] < target
    True: Double bound (bound *= 2) → Repeat.
    False: Proceed.
    Perform Binary Search
    Call expoSearch(arr, bound / 2, Math.min(bound, arr.length - 1), target).
    Check Binary Search Result
    Condition: index == -1
    True: Print "Element not present" → End
    False: Print "Element present at index: index" → End.
6.  End
*/

import java.util.Scanner;

public class exponentialSearch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 45, 67, 89, 100 };
        System.out.print("Enter Target Number: ");
        int target = obj.nextInt();

        if (arr.length != 0) {
            int index = -1; // Initialize index
            if (arr[0] == target) {
                index = 0; // Target is at the first element
            } else {
                int bound = 1;

                // Find the range where the target may exist
                while (bound < arr.length && arr[bound] < target) {
                    bound *= 2;
                }

                // Perform binary search in the identified range
                index = expoSearch(arr, bound / 2, Math.min(bound, arr.length - 1), target);
            }

            // Output the result
            if (index == -1) {
                System.out.println("Element not present");
            } else {
                System.out.println("Element present at index: " + index);
            }
        } else {
            System.out.println("Array is empty");
        }

        obj.close(); // Close the scanner
    }

    // Binary Search Helper Method
    static int expoSearch(int arr[], int min, int max, int target) {
        int mid;
        while (min <= max) {
            mid = min + (max - min) / 2; // Avoid overflow
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

}