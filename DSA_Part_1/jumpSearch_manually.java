import java.util.Scanner;

public class jumpSearch_manually {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[10];
        // System.out.println("Enter elements in array ");
        // for (int i = 0; i < 10; i++) {
        // arr[i] = obj.nextInt();
        // }

        arr = new int[] { 2, 4, 6, 7, 8, 10, 13, 15, 17, 18 };
        System.out.println("Enter target element : ");
        int target = obj.nextInt();
        int index = jumpSearch(arr, target);
        if (index == -1) {
            System.out.println("Element not found ");
        } else {
            System.out.println("Element present at index " + index);
        }
    }

    public static int jumpSearch(int arr[], int target) {

        int length = arr.length;
        int jumpBlock = (int) Math.sqrt(length);
        int previous = 0;

        for (int i = Math.min(jumpBlock, length) - 1; arr[i] < target; i = Math.min(jumpBlock, length) - 1) {
            previous = jumpBlock;
            jumpBlock += (int) Math.sqrt(length);
            if (previous >= length) {
                return -1;
            }
        }

        // Increment previous until reaches the target element index
        while (arr[previous] < target) {
            previous++;
            if (previous == jumpBlock) {
                return -1;
            }
        }

        // If element found
        if (arr[previous] == target) {
            return previous;
        }

        return -1;
    }

}
