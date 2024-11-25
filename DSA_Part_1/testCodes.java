import java.util.Scanner;
// public class testCodes {
//     public static void main(String[] args) {
//         int[] arr = { 0, 1, 5, 9, 23, 35, 49, 51, 63, 99, 105, 116, 224 };
//         Scanner obj = new Scanner(System.in);
//         System.out.println("Enter Target : ");
//         int target = obj.nextInt();
//         int index = jumpSearch(arr, target);
//         if (index == -1) {
//             System.out.println("Element not present");
//         } else {
//             System.out.println("Element present at index : " + index);
//         }
//         obj.close();
//     }

//     static int jumpSearch(int arr[], int target) {

//         int length = arr.length;
//         int jumpSize = (int) Math.sqrt(length);
//         int prev = 0;

//         // for loop for finding the block that conatins target element
//         for (int i = (int) Math.min(jumpSize, length) - 1; arr[i] < target; i = (int) Math.min(jumpSize, length) - 1) {
//             prev = jumpSize;
//             jumpSize += (int) Math.sqrt(length);
//             if (prev > length) {
//                 return -1;
//             }
//         }

//         // While loop for linear search , whn element not found
//         while (arr[prev] != target) {
//             prev++;
//             if (prev == jumpSize) {
//                 return -1;
//             }
//         }

//         // if element found
//         if (arr[prev] == target) {
//             return prev;
//         }
//         return -1;
//     }
// }

public class testCodes {
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
                index = exponentialSearch(arr, bound / 2, Math.min(bound, arr.length - 1), target);
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
    static int exponentialSearch(int arr[], int min, int max, int target) {
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
