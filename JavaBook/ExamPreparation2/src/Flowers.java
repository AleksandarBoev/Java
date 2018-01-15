import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int kupeniHrizantemi = Integer.parseInt(console.nextLine());
        int kupeniRozi = Integer.parseInt(console.nextLine());
        int kupeniLaleta = Integer.parseInt(console.nextLine());
        String season = console.nextLine().toLowerCase();
        char holyday = console.nextLine().charAt(0);

        double totalPrice = 0.0;
        double totalDiscount = 0.0;

        if (season.equals("spring") || season.equals("summer")) {
            totalPrice = 2.00 * kupeniHrizantemi + 4.10 * kupeniRozi + 2.5 * kupeniLaleta;
            if (holyday == 'Y') {
                totalPrice += totalPrice * 0.15;
            }
            if (season.equals("spring")) {
                if (kupeniLaleta > 7) {
                    totalPrice -= totalPrice * 0.05;
                }
            }
        } else if (season.equals("autumn") || season.equals("winter")) {
            totalPrice = 3.75 * kupeniHrizantemi + 4.50 * kupeniRozi + 4.15 * kupeniLaleta;
            if (holyday == 'Y') {
                totalPrice += totalPrice * 0.15;
            }
            if (season.equals("winter")) {
                if (kupeniRozi >= 10) {
                    totalPrice -= totalPrice * 0.1;
                }
            }
        }

        if (kupeniHrizantemi + kupeniLaleta + kupeniRozi > 20) {
            totalPrice -= totalPrice * 0.2;
        }

        totalPrice += 2;

        System.out.printf("%.2f", totalPrice);

        //main ends here
    }
}
