import java.util.Scanner;

public class CourierExpress {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double packageWeight = Double.parseDouble(console.nextLine());
        String serviceType = console.nextLine().toLowerCase();
        double distance = Double.parseDouble(console.nextLine());

        double totalPrice = 0;

        double pricePerKilometer = 0;
        double extra = 0;
        if (packageWeight < 1) {
            pricePerKilometer = 0.03;
            extra = pricePerKilometer * 0.8;
        } else if (packageWeight < 11) {
            pricePerKilometer = 0.05;
            extra = pricePerKilometer * 0.4;
        } else if (packageWeight < 41) {
            pricePerKilometer = 0.1;
            extra = pricePerKilometer * 0.05;
        } else if (packageWeight < 91) {
            pricePerKilometer = 0.15;
            extra = pricePerKilometer * 0.02;
        } else if (packageWeight <= 150) {
            pricePerKilometer = 0.2;
            extra = pricePerKilometer * 0.01;
        }

        if (serviceType.equals("standard")) {
            totalPrice = pricePerKilometer * distance;
        } else if (serviceType.equals("express")) {
            extra = extra * packageWeight;
            extra *= distance;
            totalPrice = pricePerKilometer * distance + extra;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", packageWeight, totalPrice);

        //main ends here
    }
}
