import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for an integer 'n'
        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        // Print the factorial of 'n'
        long factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);

        scanner.close();
    }

    // Method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
