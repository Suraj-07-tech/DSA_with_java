import java.util.Scanner;

public class jumpSearch_GFG {
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;

        // Finding block size to be jumped
        int step = (int) Math.floor(Math.sqrt(n));
        // (int) Math.floor(Math.sqrt(n)) = 4
        // Finding the block where element is
        // present (if it is present)
        int prev = 0;
        for (int minStep = Math.min(step, n) - 1; arr[minStep] < x; minStep = Math.min(step, n) - 1) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        // Doing a linear search for x in block
        // beginning with prev.
        while (arr[prev] < x) {
            prev++;

            // If we reached next block or end of that block
            // array, element is not present.
            if (prev == Math.min(step, n))
                return -1;
        }

        // If element is found
        if (arr[prev] == x)
            return prev;
        return -1;
    }

    // Driver program to test function
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[] = { 0, 1, 1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610, 615, 819, 901 };
        System.out.print("Enter Target : ");
        int x = obj.nextInt();

        // Find the index of 'x' using Jump Search
        int index = jumpSearch(arr, x);

        // Print the index where 'x' is located
        if (index != -1) {
            System.out.println("\nNumber " + x +
                    " is at index " + index);
        } else {
            System.out.println("Element not Present");
        }
    }
}

// Output: Number 55 is at index 10

// class jumpSearch_GFG {
// public static void main(String[] args) {
// int[] arr = new int[16];
// arr = new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610
// };
// }
// }