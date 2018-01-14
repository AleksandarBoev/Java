import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int cargoNumber = Integer.parseInt(console.nextLine());
        int weightSum = 0;
        double bus = 0;
        double truck = 0;
        double train = 0;
        double money = 0;

        for (int i = 0; i < cargoNumber; i++) {
            int cargoWeight = Integer.parseInt(console.nextLine());
            weightSum += cargoWeight;
            if (cargoWeight <= 3) {
                money += cargoWeight * 200;
                bus += cargoWeight;
            } else if (cargoWeight <= 11) {
                money += cargoWeight * 175;
                truck += cargoWeight;
            } else {
                money += cargoWeight * 120;
                train += cargoWeight;
            }
        }

        System.out.printf("%.2f%n", money / weightSum);
        System.out.printf("%.2f%%%n", (bus / weightSum) * 100);
        System.out.printf("%.2f%%%n", (truck / weightSum) * 100);
        System.out.printf("%.2f%%%n", (train / weightSum) * 100);

        //code ends here
    }
}