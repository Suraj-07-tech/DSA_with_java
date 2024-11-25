/*
 * Step 1: Start
 * Step 2: Initialize array with elements and input target elements 
 * Step 3: call function index=jumpSearch(arr,target) with neccessary parameters and store value in index.
 * Step 4: declare length,jumpBlock,previous and set length=arr.length,jumpblock=(int)Math.sqrt(length).
 * Step 5 : Initialize for loop as (int i=Math.min(jumpBlock,length)-1;arr[i]<target;i=Math.min(jumpBlock,lenth)-1)
    inside for loop 
    set previous =jumpBlock;
    jumpBlock=(int)Math.sqrt(length);
    also check if(prev>length)
        then  return -1;
        end for loop
*Step 6: Initiate while loop with condition (arr[prev]<target)
            update prev by one;
            also check if(pre==jumpBlock)
            then return -1;
            end while loop.
*Step 7 : check if (arr[previous]==target)
        then return prev;
        end if block 

        return -1 , if non of any above condition matches;
*Step 8 : Back to main function and
            check if (index==-1)
            then print "Element Not Present";
            else
            print "Element "and index.
 */

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
