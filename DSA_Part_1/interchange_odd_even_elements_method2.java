import java.util.Scanner;

public class interchange_odd_even_elements_method2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array (must be even):");
        int size = obj.nextInt();

        if (size % 2 == 0) {
            int arr[] = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                arr[i] = obj.nextInt();
            }

            // Printing the original array
            System.out.print("The original array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }

            // In-place swapping of odd and even indexed elements
            for (int i = 0; i < size; i++) {
                // If the index is even and the element is odd, find the next even element
                if (i % 2 == 0 && arr[i] % 2 == 1) {
                    for (int j = i + 1; j < size; j++) {
                        if (arr[j] % 2 == 0) {
                            // Swap
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
                }
                // If the index is odd and the element is even, find the next odd element
                else if (i % 2 == 1 && arr[i] % 2 == 0) {
                    for (int j = i + 1; j < size; j++) {
                        if (arr[j] % 2 == 1) {
                            // Swap
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                            break;
                        }
                    }
                }
            }

            // Printing the updated array
            System.out.print("\n\nThe Updated array: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Invalid input...\nPlease enter an even size for the array.");
        }
        obj.close();
    }
}