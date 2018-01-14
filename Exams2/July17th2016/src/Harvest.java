import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vineyardArea = Integer.parseInt(scanner.nextLine());
        double vineyardDensity = Double.parseDouble(scanner.nextLine());
        int litersRequired = Integer.parseInt(scanner.nextLine());
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());
        double allGrapes = vineyardArea * vineyardDensity;
        double wine = allGrapes * 0.4 / 2.5;
        if (wine < litersRequired) {
            double litersNeeded = Math.floor(litersRequired - wine);
            System.out.printf("It will be a tough winter! More %.00f liters wine needed.", litersNeeded);
        } else {
            double roundFloor = Math.floor(wine);
            double litersLeft = Math.ceil(wine - litersRequired);
            double perPerson = Math.ceil(litersLeft / numberOfWorkers);
            System.out.printf("Good harvest this year! Total wine: %.00f liters.%n", roundFloor);
            System.out.printf("%.00f liters left -> %.00f liters per person.", litersLeft, perPerson);
        }
    }
}