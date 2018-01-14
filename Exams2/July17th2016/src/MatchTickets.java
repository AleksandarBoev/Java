import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double vipPrice = 499.99;
        double normalPrice = 249.99;

        double transportPercentageFromBudget = 0;

        double budget = Double.parseDouble(console.nextLine());
        String ticketType = console.nextLine();
        int numberOfPeople = Integer.parseInt(console.nextLine());

        if (numberOfPeople <= 4) {
            transportPercentageFromBudget = 0.75;
        } else if (numberOfPeople <= 9) {
            transportPercentageFromBudget = 0.60;
        } else if (numberOfPeople <= 24) {
            transportPercentageFromBudget = 0.50;
        } else if (numberOfPeople <= 49) {
            transportPercentageFromBudget = 0.4;
        } else {
            transportPercentageFromBudget = 0.25;
        }

        budget -= budget * transportPercentageFromBudget;

        if (ticketType.equals("Normal")) {
            budget -= numberOfPeople * normalPrice;
        } else if (ticketType.equals("VIP")) {
            budget -= numberOfPeople * vipPrice;
        }

        if (budget < 0) {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget));
        } else {
            System.out.printf("Yes! You have %.2f leva left.", budget);
        }

        //main ends here
    }
}