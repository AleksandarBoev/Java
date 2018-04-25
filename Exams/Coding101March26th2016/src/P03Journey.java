import java.util.Scanner;

public class P03Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String sentence = "Somewhere in ";
        String residence = "";
        double seasonPrice = 0;

        if (season.equals("summer")) {
            residence = "Camp - ";
        } else if (season.equals("winter")) {
            residence = "Hotel - ";
        }

        if (budget <= 100) {
            sentence += "Bulgaria";
            if (season.equals("summer")) {
                seasonPrice = 0.3;
            } else if (season.equals("winter")) {
                seasonPrice = 0.7;
            }

        } else if (budget <= 1000) {
            sentence += "Balkans";
            if (season.equals("summer")) {
                seasonPrice = 0.4;
            } else if (season.equals("winter")) {
                seasonPrice = 0.8;
            }

        } else if (budget > 1000) {
            sentence += "Europe";
            residence = "Hotel - ";
            seasonPrice = 0.9;
        }

        double moneySpent = budget * seasonPrice;

        System.out.println(sentence);
        System.out.printf("%s%.2f", residence, moneySpent);


        //code ends here
    }
}