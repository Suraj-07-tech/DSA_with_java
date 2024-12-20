import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 3;
        System.out.println("================================");
        while (i > 0) {
            int num;
            String str;
            str = input.next();
            num = input.nextInt();
            System.out.print("" + str);
            for (int j = 0; j < (15 - str.length()); j++)
                System.out.print(" ");
            if (num < 10)
                System.out.println("00" + num);
            else if (num < 100)
                System.out.println("0" + num);
            else
                System.out.println("" + num);
            i--;
        }
        System.out.println("================================");
        input.close();
    }

}