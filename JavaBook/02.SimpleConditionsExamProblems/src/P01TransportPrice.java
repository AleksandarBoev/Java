import java.util.Scanner;

public class P01TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        if (distance >= 100) {
            double price = distance * 0.06;
            System.out.printf("%.02f", price);
        } else if (distance >= 20) {
            double price = distance * 0.09;
            System.out.printf("%.02f", price);
        } else {
            double price = 0.70;
            if (timeOfDay.toLowerCase().equals("day")) {
                price += distance * 0.79;
            } else if (timeOfDay.toLowerCase().equals("night")) {
                price += distance * 0.90;
            }
            System.out.printf("%.02f", price);
        }
    }
}
