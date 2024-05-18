import java.util.Scanner;
import java.util.Set;

class Calculator {

    private static final Set<String> ALLOWED_OPERATIONS = Set.of("+", "-", "*", "/");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long left = scanner.nextLong();
        String operation = scanner.next();
        long right = scanner.nextLong();
        if(validate(operation, right)) {
            System.out.println(evaluate(operation, left, right));
        }

        scanner.close();
    }

    protected static boolean validate(String operation, long right) {
        if(operation.equals("/") && right == 0) {
            System.out.println("Division by 0!");
            return false;
        }
        if(!ALLOWED_OPERATIONS.contains(operation)) {
            System.out.println("Unknown operator");
            return false;
        }
        return true;
    }

    private static long evaluate(String operation, long left, long right) {
        switch(operation) {
            case "+": return left + right;
            case "-": return left - right;
            case "*": return left * right;
            case "/": return left / right;
            default: throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }
}