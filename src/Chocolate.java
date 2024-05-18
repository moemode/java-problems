import java.util.Scanner;

class Chocolate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input parsing
        int n = scanner.nextInt(); // Width of the chocolate bar
        int m = scanner.nextInt(); // Height of the chocolate bar
        int k = scanner.nextInt(); // Number of segments to break off

        // Problem Description:
        // Given a rectangular chocolate bar divided into segments, determine if it's
        // possible to break off exactly K segments with a single straight line,
        // either vertically or horizontally.

        if(breakoffPossible(n, m, k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean breakoffPossible(int n, int m, int k) {
        if(k % n == 0 && k / n <= m) {
            return true;
        }
        if(k % m == 0 && k / m <= n) {
            return true;
        }
        return false;
    }

}
