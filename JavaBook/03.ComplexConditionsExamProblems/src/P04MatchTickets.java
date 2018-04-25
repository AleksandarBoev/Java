import java.util.Scanner;

public class P04MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine().toLowerCase();  //vip/normal
        int people = Integer.parseInt(scanner.nextLine());

        double transport = 0;

        if (people >= 1 && people <= 4) {
            transport = 0.75 * budget;
        } else if (people >= 5 && people <= 9) {
            transport = 0.6 * budget;
        } else if (people >= 10 && people <= 24) {
            transport = 0.5 * budget;
        } else if (people >= 25 && people <= 49) {
            transport = 0.4 * budget;
        } else if (people >= 50) {
            transport = 0.25 * budget;
        }

        budget -= transport;

        if (category.equals("vip")) {
            budget -= people * 499.99;
        } else if (category.equals("normal")) {
            budget -= people * 249.99;
        }

        if (budget >= 0) {
            System.out.printf("Yes! You have %.02f leva left.", budget);
        } else {
            System.out.printf("Not enough money! You need %.02f leva.", Math.abs(budget));
        }

        //code ends here
    }
}
