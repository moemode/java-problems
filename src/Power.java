import java.util.Scanner;

public class Power {

    public static long power(int n, int m) {
        long res = 1;
        while (m > 0) {
            if ((m & 1) == 1)
                res *= n;
            n *= n;
            m >>= 1;
        }
        return res;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}