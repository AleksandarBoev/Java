import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int dancers = Integer.parseInt(console.nextLine());
        double points = Double.parseDouble(console.nextLine());
        String season = console.nextLine();
        String place = console.nextLine();

        double cashPrize = 0;

        if (place.equals("Bulgaria")) {
            cashPrize = dancers * points;
            if (season.equals("summer")) {
                cashPrize -= cashPrize * 0.05;
            } else if (season.equals("winter")) {
                cashPrize -= cashPrize * 0.08;
            }
        } else if (place.equals("Abroad")) {
            cashPrize = dancers * points + (dancers * points) * 0.5;
            if (season.equals("summer")) {
                cashPrize -= cashPrize * 0.1;
            } else if (season.equals("winter"))
            cashPrize -= cashPrize * 0.15;
        }

        double charityMoney = cashPrize * 0.75;
        cashPrize -= charityMoney;
        double prizePerPerson = cashPrize / dancers;

        System.out.printf("Charity - %.2f%n", charityMoney);
        System.out.printf("Money per dancer - %.2f", prizePerPerson);

        //main ends here
    }
}
