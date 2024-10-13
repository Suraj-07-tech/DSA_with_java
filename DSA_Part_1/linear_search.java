// Algorithm : 
/*
 Step 1: Start
 Step 2: Read input from user as num
 Step 3: initiate for loop from 
            i=0 to i<lengthOfArray
 Step 4: check inside loop if array[i]== num 
            then print "Number found"
            then break;
           and if i reaches to the lengthof array without finding the number 
            then print "element not found"
 Step 5 : End                      
 */

/*
 * Time Complexity: O(n)
 * Space Complexity : O(1)
 */

import java.util.Scanner;

class linear_search {
    public static void main(String[] args) {
        int num;
        int dummy_array[] = { 1, 2, 45, 67, 23, 45, 91, 90, 56, 101, 789 };// Taking a dummy Array
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number you want to search");
        num = obj.nextInt();// user Input
        for (int i = 0; i < dummy_array.length; i++) {
            if (dummy_array[i] == num) {
                // Comparision with each array element

                System.out.println(num + " Found at Index " + i);
                break;// if found then breaking for loop
            }
            if (i == dummy_array.length) {
                System.out.println("Element Not found....");
                // if not found
            }
        }
        obj.close();

    }
}