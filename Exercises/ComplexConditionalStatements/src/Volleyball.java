import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int weeks = 48;
        double saturdayPlay = (weeks - h) * 0.75;
        double p1 = p * (2.0 / 3.0);
        double result = saturdayPlay + h + p1;
        if (year.equals("leap")) {
            result += result * 0.15;
            result = Math.floor(result);
            System.out.printf("%f", result);
        } else if (year.equals("normal")) {
            result = Math.floor(result);
            System.out.printf("%f", result);
        }

        //code ends here
    }
}