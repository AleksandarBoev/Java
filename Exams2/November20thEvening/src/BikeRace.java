import java.text.DecimalFormat;
import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int juniorCyclists = Integer.parseInt(console.nextLine());
        int seniorCyclists = Integer.parseInt(console.nextLine());
        String route = console.nextLine();

        double sum = 0.0;

        double juniorTrailPrice = 5.50;
        double juniorCrossCountryPrice = 8.0;
        double juniorDownhillPrice = 12.25;
        double juniorRoadPrice = 20.0;

        double seniorTrailPrice = 7.0;
        double seniorCrossCountryPrice = 9.50;
        double seniorDownhillPrice = 13.75;
        double seniorRoadPrice = 21.50;

        switch (route) {
            case "trail":
                sum = juniorCyclists * juniorTrailPrice + seniorCyclists * seniorTrailPrice;
                break;
            case "cross-country":
                sum = juniorCyclists * juniorCrossCountryPrice + seniorCyclists * seniorCrossCountryPrice;
                if (juniorCyclists + seniorCyclists >= 50) {
                    sum -= sum * 0.25;
                }
                break;
            case "downhill":
                sum = juniorCyclists * juniorDownhillPrice + seniorCyclists * seniorDownhillPrice;
                break;
            case "road":
                sum = juniorCyclists * juniorRoadPrice + seniorCyclists * seniorRoadPrice;
                break;
            default:
                return;
        }


        sum -= sum * 0.05;


        System.out.printf("%.2f", sum);

        //code ends here
    }
}
