/*
 * Step 1 : Start
 * Step 2: Declare num,arr[],min,max,mid;
 * Step 3: set assign values in arr[],min=0,max=arr.length-1,read
 * num;
 * Step 4 : Start while loop with conditon (min<=max);
 * Step 5: Inside while loop calculate mid=min+(max-min)/2;
 * and if(arr[mid]==num)
 * then print "Element found " and break;
 * else if(arr[mid]<num) then set min=mid+1;
 * else set max=mid-1;
 * end while loop
 * Step 6 : if(min>max) then print "Not present";
 * Step 7 : End
 */

import java.util.Scanner;

class binary_Search {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        boolean flag = false;
        int[] arr;
        int num;
        arr = new int[] { 10, 11, 17, 42, 90, 231 };
        System.out.print("Enter the number you want to search : ");
        num = obj.nextInt();
        int min, max, mid;
        min = 0;
        max = arr.length - 1;
        while (min <= max) {
            mid = min + (max - min) / 2;
            if (arr[mid] == num) {
                System.out.println("Your Element is present at index : " + mid);
                // flag = true;
                break;
            } else if (arr[mid] < num) {
                min = mid + 1;
            } else if (arr[mid] > num) {
                max = mid - 1;
            }
        }
        if (min > max) {
            System.out.println("Your Element is not present in the array");
        }

    }
}
