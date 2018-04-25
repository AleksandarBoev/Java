import java.text.DecimalFormat;
import java.util.Scanner;

public class P03OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number1 = Integer.parseInt(console.nextLine());
        int number2 = Integer.parseInt(console.nextLine());
        char operation = console.nextLine().charAt(0);
        double result;
        DecimalFormat df = new DecimalFormat("#####.##");

        switch (operation) {
            case '+':
                result = number1 + number2;
                System.out.printf("%d + %d = %s - ", number1, number2, df.format(result));
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;

            case '-':
                result = number1 - number2;
                System.out.printf("%d - %d = %s - ", number1, number2, df.format(result));
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;

            case '*':
                result = number1 * number2;
                System.out.printf("%d * %d = %s - ", number1, number2, df.format(result));
                if (result % 2 == 0) {
                    System.out.println("even");
                } else {
                    System.out.println("odd");
                }
                break;

            case '/':
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    result = 1.0 * number1 / number2;
                    System.out.printf("%d %c %d = %.2f", number1, operation, number2, result);
                }
                break;

            case '%':
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                } else {
                    result = number1 % number2;
                    System.out.printf("%d %c %d = %s", number1, operation, number2, df.format(result));
                }
                break;
        }

        //main ends here
    }
}
