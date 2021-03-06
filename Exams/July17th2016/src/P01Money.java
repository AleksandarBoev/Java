import java.util.Scanner;

public class P01Money {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int bitcoinToLeva = 1168;
        double iuanToDollar = 0.15;
        double dollarToLeva = 1.76;
        double levaToEuro = 1.95;

        int bitcoins = Integer.parseInt(console.nextLine());
        double iuans = Double.parseDouble(console.nextLine());
        double servicePricePercentage = Double.parseDouble(console.nextLine()) / 100.0;

        double dollars = iuans * iuanToDollar;
        double totalLeva = bitcoins * bitcoinToLeva + dollars * dollarToLeva;
        double totalEuro = totalLeva / levaToEuro - (totalLeva / levaToEuro * servicePricePercentage);

        System.out.printf("%.2f", totalEuro);
        //main ends here
    }
}