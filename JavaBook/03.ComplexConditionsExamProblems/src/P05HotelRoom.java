import java.util.Scanner;

public class P05HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine().toLowerCase(); //May, June, July, August, September, October
        int nights = Integer.parseInt(scanner.nextLine());

        double discountStudio = 0;
        double discountApartment = 0;
        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "may": case "october":
                if (nights > 14) {
                    discountStudio = (50 * nights) * 0.3;
                } else if (nights > 7) {
                    discountStudio = (50 * nights) * 0.05;
                }
                priceStudio = 50 * nights - discountStudio;
                priceApartment = 65 * nights;
            break;

            case "june": case "september":
                if (nights > 14) {
                    discountStudio = (75.2 * nights) * 0.2;
                }
                priceStudio = 75.2 * nights - discountStudio;
                priceApartment = 68.70 * nights;
            break;

            case "july": case "august":
                priceStudio = 76 * nights;
                priceApartment = 77 * nights;
            break;
        }

        if (nights > 14) {
            discountApartment = priceApartment * 0.1;
        }

        priceApartment -= discountApartment;

        System.out.printf("Apartment: %.02f lv.%n", priceApartment);
        System.out.printf("Studio: %.02f lv.", priceStudio);

        //code ends here
    }
}
