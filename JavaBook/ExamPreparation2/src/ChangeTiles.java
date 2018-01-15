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
        double workerPrice = Double.parseDouble(console.nextLine());

        double floorArea = floorLength * floorWidth;
        double triangleTileArea = triangleHeight * triangleSide / 2.0;
        long triangleTileNumber = (long) Math.ceil(floorArea / triangleTileArea) + 5;
        double moneyNeeded = workerPrice + (triangleTileNumber * pricePerTile);
        double moneyLeft = budget - moneyNeeded;

        if (moneyLeft < 0) {
            System.out.printf("You'll need %.2f lv more.", Math.abs(moneyLeft));
        } else {
            System.out.printf("%.2f lv left.", moneyLeft);
        }
        //main ends here
    }
}
