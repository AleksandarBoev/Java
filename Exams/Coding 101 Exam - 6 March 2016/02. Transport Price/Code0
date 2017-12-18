import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int kilometres = Integer.parseInt(console.nextLine());
        String timeOfDay = console.nextLine().toLowerCase();

        double transportPrice = 0;

        if (kilometres < 20) {
            switch (timeOfDay) {
                case "day": {
                    transportPrice = 0.70 + (0.79 * kilometres);
                    break;
                }
                case "night": {
                    transportPrice = 0.70 + (0.90 * kilometres);
                    break;
                }

            }

        } else if (kilometres < 100) {
            transportPrice = 0.09 * kilometres;
        } else {
            transportPrice = 0.06 * kilometres;
        }

        System.out.printf("%.2f", transportPrice);

        //code ends here
    }
}
