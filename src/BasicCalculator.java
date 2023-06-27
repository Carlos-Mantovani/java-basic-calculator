import java.util.InputMismatchException;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // store the two numbers
        double a = 0, b = 0;

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
        double result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}
