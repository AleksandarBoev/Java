import java.util.Scanner;

public class EnergyLoss {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());
        int dancers = Integer.parseInt(console.nextLine());

        int totalEnergy = dancers * 100 * days;

        for (int day = 1; day <= days; day++) {
            int hours = Integer.parseInt(console.nextLine());
            int exhaustion = 0;
            if (day % 2 == 0 && hours % 2 == 0) {
                exhaustion = 68;
            } else if (day % 2 == 0 && hours % 2 != 0) {
                exhaustion = 65;
            } else if (day % 2 != 0 && hours % 2 == 0) {
                exhaustion = 49;
            } else if (day % 2 != 0 && hours % 2 != 0) {
                exhaustion = 30;
            }
            totalEnergy -= exhaustion * dancers;
        }

        double energyLeftPercentage = 1.0 * totalEnergy / dancers / days;

        if (energyLeftPercentage <= 50) {
            System.out.printf("They are wasted! Energy left: %.2f", energyLeftPercentage);
        } else {
            System.out.printf("They feel good! Energy left: %.2f", energyLeftPercentage);
        }

        //main ends here
    }
}
