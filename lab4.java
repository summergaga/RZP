import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Enter first number
        System.out.print("First number: ");
        int num1 = scan.nextInt();

        // Enter second number
        System.out.print("Second number: ");
        int num2 = scan.nextInt();

        // Calculation GCD
        int gcd = findGCD(num1, num2);
        System.out.println("The desired GCD is " + gcd);

        if (Simple(gcd)) {
            System.out.println(gcd + " is a even number.");
        } else {
            System.out.println(gcd + " is odd number.");
        }

        scan.close();
    }

    // Euclidean algorithm
    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);
        }
    }

    // Checking GCD on simple
    public static boolean Simple(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}