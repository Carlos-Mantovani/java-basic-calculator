import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // store the two numbers
        double a, b;

        // create scanner for user input
        Scanner scanner = new Scanner(System.in);

        // ask user for input
        System.out.println("Enter the numbers: ");

        // handle invalid input
        try {
            // take user input
            a = scanner.nextDouble();
            b = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
            return;
        }


        System.out.println("Enter the operator (+,-,*,/)");

        char operator = scanner.next().charAt(0);
        double result;

        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> result = a / b;
            default -> {
                System.out.println("Invalid operator");
                return;
            }
        }

        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}
