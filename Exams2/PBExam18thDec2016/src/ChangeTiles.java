import java.util.Scanner;

public class ChangeTiles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        double floorWidth = Double.parseDouble(console.nextLine());
        double floorLength = Double.parseDouble(console.nextLine());
        double triangleSide = Double.parseDouble(console.nextLine());
        double triangleHeight = Double.parseDouble(console.nextLine());
        double pricePerTile = Double.parseDouble(console.nextLine());
        double workerPay = Double.parseDouble(console.nextLine());

        double floorArea = floorLength * floorWidth;
        double tileArea = (triangleHeight * triangleSide) / 2.0;
        long tilesNeeded = (long) Math.ceil(floorArea / tileArea) + 5;
        double price = tilesNeeded * pricePerTile + workerPay;

        if (budget < price) {
            System.out.printf("You'll need %.2f lv more.", Math.abs(budget - price));
        } else {
            System.out.printf("%.2f lv left.", budget - price);
        }
        //main ends here
    }
}
