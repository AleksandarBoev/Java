import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int elderly = Integer.parseInt(console.nextLine());
        int students = Integer.parseInt(console.nextLine());
        int stay = Integer.parseInt(console.nextLine());
        String transport = console.nextLine().toLowerCase();

        double sum = 0.0;

        double trainPriceElderly = 24.99;
        double trainPriceStudent = 14.99;
        double busPriceElderly = 32.50;
        double busPriceStudent = 28.50;
        double boatPriceElderly = 42.99;
        double boatPriceStudent = 39.99;
        double airplanePriceElderly = 70.00;
        double airplanePriceStudent = 50.00;

        double moneyElderly = 0.0;
        double moneyStudent = 0.0;

        if (transport.equals("train")) {
            if (students + elderly >= 50) {
                trainPriceElderly *= 0.50;
                trainPriceStudent *= 0.50;
            }
            moneyElderly = trainPriceElderly * elderly;
            moneyStudent = trainPriceStudent * students;
            sum += (moneyElderly + moneyStudent) * 2;
        } else if (transport.equals("bus")) {
            moneyElderly = busPriceElderly * elderly;
            moneyStudent = busPriceStudent * students;
            sum += (moneyElderly + moneyStudent) * 2;
        } else if (transport.equals("boat")) {
            moneyElderly = boatPriceElderly * elderly;
            moneyStudent = boatPriceStudent * students;
            sum += (moneyElderly + moneyStudent) * 2;
        } else if (transport.equals("airplane")) {
            moneyElderly = airplanePriceElderly * elderly;
            moneyStudent = airplanePriceStudent * students;
            sum += (moneyElderly + moneyStudent) * 2;
        }

        sum += stay * 82.99;
        sum += sum * 0.10; //10% commission

        System.out.printf("%.2f", sum);
        //code ends here
    }
}
