import java.text.DecimalFormat;
import java.util.Scanner;

public class P03Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //todo opitai da smenish integerite s double
//        int n1 = Integer.parseInt(scanner.nextLine());
        double n1 = Double.parseDouble(scanner.nextLine());
//        int n2 = Integer.parseInt(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
//        String operation1 = scanner.nextLine();
//        char operation = operation1.charAt(0);
        char operation = scanner.nextLine().charAt(0);
//        boolean range = (n1 < 0 || n1 > 40000) || (n2 < 0 || n2 > 40000);
//        boolean op = operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("%");
//        if (range || op) {
//            return;
//        }

        double result = 0;
        String oddeven = "";

        DecimalFormat df = new DecimalFormat("###########################################.############################");


        switch (operation) {
            case '+':
                result = n1 + n2;
                if (result % 2 == 0) {
                    oddeven = "even";
                } else {
                    oddeven = "odd";
                }
                System.out.println(df.format(n1) + " " + operation + " " + df.format(n2) + " =" + " " + df.format(result) + " - " + oddeven);
                break;
            case '-':
                result = n1 - n2;
                if (result % 2 == 0) {
                    oddeven = "even";
                } else {
                    oddeven = "odd";
                }
                System.out.println(df.format(n1) + " " + operation + " " + df.format(n2) + " =" + " " + df.format(result) + " - " + oddeven);
                break;
            case '*':
                result = n1 * n2;
                if (result % 2 == 0) {
                    oddeven = "even";
                } else {
                    oddeven = "odd";
                }
                System.out.println(df.format(n1) + " " + operation + " " + df.format(n2) + " =" + " " + df.format(result) + " - " + oddeven);
                break;

            case '/':
                if (n2 == 0) {
                    System.out.println("Cannot divide " + df.format(n1) + " by zero");
                } else {
                    double d = n2;  // int = 32 bit, double = 64 bit => nqma zaguba na danni pri neqvno preobrazuvane
                    result = n1 / d; //  n1 / n2 e celochisleno delenie
                    System.out.print(df.format(n1) + " " + operation + " " + df.format(n2) + " =" + " ");// + df.format(result));
                    System.out.printf("%.02f", result);
                }
                break;
            case '%':
                if (n2 == 0) {
                    System.out.println("Cannot divide " + df.format(n1) + " by zero");
                } else {
                    result = n1 % n2;
                    System.out.println(df.format(n1) + " " + operation + " " + df.format(n2) + " =" + " " + df.format(result));
                }
                break;

            default:
                System.out.println("");
                break;

        }

        //code ends here
    }
}
