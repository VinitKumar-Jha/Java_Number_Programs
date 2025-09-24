/*WAJP to take user input and print nth prime number. */

import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to find the nth prime number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }

        int count = 0;
        int num = 1;

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        System.out.println("The " + n + "th prime number is: " + num);
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
