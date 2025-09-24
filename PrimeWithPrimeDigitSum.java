import java.util.Scanner;

public class PrimeWithPrimeDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of range: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound of range: ");
        int upper = sc.nextInt();

        int count = 0;

        System.out.println("Prime numbers whose sum of digits is also prime: ");
        for (int num = lower; num <= upper; num++) {
            if (isPrime(num) && isPrime(sumOfDigits(num))) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println("\nTotal count: " + count);
        sc.close();
    }

    // Function to check prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Function to calculate sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}