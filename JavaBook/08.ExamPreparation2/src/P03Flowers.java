import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfHrizantemi = Integer.parseInt(console.nextLine());
        int numberOfRozi = Integer.parseInt(console.nextLine());
        int numberOfLaleta = Integer.parseInt(console.nextLine());
        String season = console.nextLine();
        char holiday = console.nextLine().charAt(0);

        double priseHrizantemi = 0;
        double priseRozi = 0;
        double priseLaleta = 0;

        if (season.equals("Spring") || season.equals("Summer")) {
            priseHrizantemi = 2.0;
            priseRozi = 4.10;
            priseLaleta = 2.50;
        } else if (season.equals("Winter") || season.equals("Autumn")) {
            priseHrizantemi = 3.75;
            priseRozi = 4.50;
            priseLaleta = 4.15;
        }

        if (holiday == 'Y') {
            priseHrizantemi += priseHrizantemi * 0.15;
            priseRozi += priseRozi * 0.15;
            priseLaleta += priseLaleta * 0.15;
        }

        double totalPrice = priseHrizantemi * numberOfHrizantemi + priseLaleta * numberOfLaleta + priseRozi * numberOfRozi;

        if (numberOfLaleta > 7 && season.equals("Spring")) {
            totalPrice -= totalPrice * 0.05;
        }
        if (numberOfRozi >= 10 && season.equals("Winter")) {
            totalPrice -= totalPrice * 0.1;
        }
        if (numberOfHrizantemi + numberOfLaleta + numberOfRozi > 20) {
            totalPrice -= totalPrice * 0.2;
        }

//        totalPrice -= totalPrice * totalDiscount + 2; // nevqrno!
        totalPrice += 2; //tova i gornoto ne sa ednakvi!
//        totalPrice = totalPrice - (totalPrice * totalDiscount + 2); //veche tova i purvoto sa ednakvi!
        System.out.printf("%.2f", totalPrice);

        //main ends here
    }
}
