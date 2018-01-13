import java.text.DecimalFormat;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int daysWithoutSanta = Integer.parseInt(console.nextLine());
        int foodLeftKilos = Integer.parseInt(console.nextLine());
        double foodForRaindeer1 = Double.parseDouble(console.nextLine());
        double foodForRaindeer2 = Double.parseDouble(console.nextLine());
        double foodForRaindeer3 = Double.parseDouble(console.nextLine());

        double foodNeededForRaindeer1 = daysWithoutSanta * foodForRaindeer1;
        double foodNeededForRaindeer2 = daysWithoutSanta * foodForRaindeer2;
        double foodNeededForRaindeer3 = daysWithoutSanta * foodForRaindeer3;
        double foodNeededForAll = foodNeededForRaindeer1 + foodNeededForRaindeer2 + foodNeededForRaindeer3;
        double difference = foodLeftKilos - foodNeededForAll;

        DecimalFormat df = new DecimalFormat("#.#");

        if (difference >= 0) {
            System.out.printf("%s kilos of food left.", df.format(Math.floor(difference)));
        } else {
            System.out.printf("%s more kilos of food are needed.", df.format(Math.ceil(Math.abs(difference))));
        }


//        main ends here
    }
}
