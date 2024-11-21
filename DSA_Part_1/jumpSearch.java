import java.util.Scanner;

public class jumpSearch {
    public static void main(String[] args) {
        int target, arr[];
        Scanner obj = new Scanner(System.in);
        boolean flag = false;
        arr = new int[] { -243, -10, 0, 12, 34, 56, 57, 68, 89, 91, 94, 96, 99, 100, 107, 182 };
        System.out.println("Enter Searching Number : ");
        target = obj.nextInt();
        int jumpBlock = (int) Math.sqrt(arr.length);
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == target) {
                System.out.println("Element is present at index " + i);
                flag = true;
                break;
            } else if (arr[i] < target) {

                if (i == 0) {
                    i += jumpBlock - 1;
                } else {
                    i += jumpBlock;
                }
            } else if (arr[i] > target && i == 0) {
                break;
            } else {
                if (i < jumpBlock) {
                    for (int j = 0; j < jumpBlock; j++) {
                        if (arr[j] == target) {
                            System.out.println("Element is present at index : " + j);
                            flag = true;
                            break;
                        }
                    }
                } else {
                    for (int j = i - jumpBlock; j < i; j++) {
                        if (arr[j] == target) {
                            System.out.println("Element is present at index : " + j);
                            flag = true;
                            break;
                        }
                    }
                }
                break;
            }
        }
        if (!flag) {
            System.out.println("Element is not present in array");
        }
        obj.close();
    }
}
