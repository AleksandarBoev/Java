import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());
        String roomType = console.nextLine(); //"room for one person",  "apartment" или "president apartment"
        String opinion = console.nextLine();// "positive"  или "negative"
        int nights = days - 1;

        int priceRoomForOnePerson = 18;
        int priceApartment = 25;
        int pricePresidentApartment = 35;
        double discount = 0;
        double totalPrice = 0;

        if (roomType.equals("apartment")) {
            totalPrice = nights * priceApartment;
            if (days < 10) {
                discount = 0.3;
            } else if (days >= 10 && days <= 15) {
                discount = 0.35;
            } else if (days > 15) {
                discount = 0.5;
            }

        } else if (roomType.equals("president apartment")) {
            totalPrice = nights * pricePresidentApartment;
            if (days < 10) {
                discount = 0.1;
            } else if (days >= 10 && days <= 15) {
                discount = 0.15;
            } else if (days > 15) {
                discount = 0.2;
            }

        } else if (roomType.equals("room for one person")) {
            totalPrice = nights * priceRoomForOnePerson;
        }

        totalPrice -= totalPrice * discount;

        if (opinion.equals("positive")) {
            totalPrice += totalPrice * 0.25;
        } else if (opinion.equals("negative")) {
            totalPrice -= totalPrice * 0.1;
        }

        System.out.printf("%.2f", totalPrice);


//        main ends here
    }
}
