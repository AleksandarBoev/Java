import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfPackagingPaper = Integer.parseInt(console.nextLine());
        int numberOfLeatherPieces = Integer.parseInt(console.nextLine());
        double litersGlue = Double.parseDouble(console.nextLine());
        double discountPercent = Double.parseDouble(console.nextLine()) / 100.0;

        double packagingPaperPrice = 5.8;
        double leatherPiecesPrice = 7.2;
        double literGluePrice = 1.2;

        double price1 = packagingPaperPrice * numberOfPackagingPaper;
        double price2 = numberOfLeatherPieces * leatherPiecesPrice;
        double price3 = literGluePrice * litersGlue;

        double totalPrice = price1 + price2 + price3;
        totalPrice -= totalPrice * discountPercent;

        System.out.printf("%.3f", totalPrice);
//        main ends here
    }
}
