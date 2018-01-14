import java.util.Scanner;

public class TradeComission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        if (!town.equals("sofia") && !town.equals("plovdiv") && !town.equals("varna")) {
            System.out.println("error");
            return;
        }
        if (sales < 0) {
            System.out.println("error");
            return;
        }
        double commissions = -1;
        if (town.equals("sofia")) {
            if (sales >= 0 && sales <= 500) {
                commissions = 0.05;
            } else if (sales > 500 && sales <= 1000) {
                commissions = 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                commissions = 0.08;
            } else if (sales > 10000) {
                commissions = 0.12;
            }


        } else if (town.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commissions = 0.055;
            } else if (sales > 500 && sales <= 1000) {
                commissions = 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                commissions = 0.12;
            } else if (sales > 10000) {
                commissions = 0.145;
            } } else if (town.equals("varna")) {
            if (sales >= 0 && sales <= 500) {
                commissions = 0.045;
            } else if (sales > 500 && sales <= 1000) {
                commissions = 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                commissions = 0.10;
            } else if (sales > 10000) {
                commissions = 0.13;
        } }
        double result = sales * commissions;
        System.out.printf("%.2f", result);
        //code ends here
    }
}
