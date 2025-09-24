/*WAJP to print  all the  alternate Prime numbers up to a given range.
 * o/p:
2 5 11 17….
Or
3 7 13 19
 */

import java.util.Scanner;

public class AlternatePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        int primeCount = 0;

        System.out.print("Alternate prime number of odd positions are: ");
        for (int num = 2; num <= range; num++) {
            if (isPrime(num)) {
                primeCount++;
                if (primeCount % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        }
        primeCount = 0; // Reset count for even position primes
        System.out.print("\nAlternate primes numbers of even positions are: ");
        for (int num = 2; num <= range; num++) {
            if (isPrime(num)) {
                primeCount++;
                if (primeCount % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
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