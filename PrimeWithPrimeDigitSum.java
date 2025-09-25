/*WAJP to print and count all prime numbers in a range where sum of digits is also prime number.
 */

import java.util.Scanner;

public class PrimeWithPrimeDigitSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper range: ");
        int upper = sc.nextInt();

        int count = 0;
        System.out.println("Prime numbers whose sum of digits is also prime: ");
        for (int num = lower; num <= upper; num++) {
            int sum = sumOfDigits(num);
            if (isPrime(num) && isPrime(sum)) {
                System.out.println(num + " (sum = " + sum + ")");
                count++;
            }
        }

        System.out.println("\nTotal count: " + count);
        sc.close();
    }
    public static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        if(num %  2 == 0){
            return false;
        }
        for(int i = 3; i<= Math.sqrt(num); i+=2){
            if(num%i == 0){
                return false;
            }
        }
        return true;
}
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num>0){
            sum= sum + num%10;
            num = num/10;
        }
        return sum;
    }
}