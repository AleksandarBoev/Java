import java.util.Scanner;

public class TailoringWorkshop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int rectangleTables = Integer.parseInt(console.nextLine());
        double tableLength = Double.parseDouble(console.nextLine());
        double tableWidth = Double.parseDouble(console.nextLine());

        double priceRectangleMeter = 7.0;
        double priceSquareMeter = 9.0;
        double dollarPrice = 1.85;

        double areaRectangle = rectangleTables * (tableLength + 2 * 0.30) * (tableWidth + 2 * 0.30);
        double areaSquare = rectangleTables * (tableLength /2 ) * (tableLength / 2);

        double priceInDollars = areaRectangle * priceRectangleMeter + areaSquare * priceSquareMeter;
        double priceInLevas = priceInDollars * dollarPrice;

        System.out.printf("%.2f USD%n", priceInDollars);
        System.out.printf("%.2f BGN", priceInLevas);
        //main ends here
    }
}