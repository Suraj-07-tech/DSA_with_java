import java.util.*;
import java.lang.*;

public class binary_search {
    public static void main(String[] args) {

        int min, max, mid, num;
        boolean flag = false;
        Scanner obj = new Scanner(System.in);
        int arr[] = { 67, 12, 89, 90, 34, 20, 6, 7 };
        Arrays.sort(arr);// We have to sort the array firstly
        // {6,7,12,20,34,67,89,90}
        min = 0;
        max = arr.length - 1;
        System.out.print("Enter the number you want to search : ");
        num = obj.nextInt();

        while (min <= max) {
            mid = (min + max) / 2;
            if (arr[mid] == num) {
                System.out.println(num + " at index " + mid);
                flag = true;
                break;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else if (arr[mid] > num) {
                max = mid - 1;
            }
        }
        if (!flag) {
            System.out.println("Number Not Found");
        }
        obj.close();
    }
}
