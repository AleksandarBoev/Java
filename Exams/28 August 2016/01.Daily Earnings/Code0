import java.util.Scanner;

public class DailyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workdays = Integer.parseInt(scanner.nextLine());  //rabotni dni v sedmicata
        double earnedCash = Double.parseDouble(scanner.nextLine()); //pripecheleni pari na den (v dolari)
        double dollarPrice = Double.parseDouble(scanner.nextLine()); // cena na dolar

        double monthlySalary = earnedCash * workdays;
        double bonus  = monthlySalary * 2.5;
        double totalDolars = monthlySalary * 12 + bonus;
        totalDolars -= totalDolars * 0.25;
        double totalLevas = totalDolars * dollarPrice;
        double levasPerDay = totalLevas / 365;

        System.out.printf("%.02f", levasPerDay);


        //code ends here
    }
}
