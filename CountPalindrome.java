/* WAJP to print and count all the palindrome numbers in a given range.*/

import java.util.Scanner;

public class CountPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Start range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end range: ");
        int end = sc.nextInt();
        int count = 0;
        System.out.println("Palindrome numbers are between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("Total palindrome numbers are: " + count);
        sc.close();
    }

    public static boolean isPalindrome(int num) {
        int rev = 0;
        int temp = num;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return temp == rev;
    }
}
