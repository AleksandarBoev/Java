import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfMoves = Integer.parseInt(console.nextLine());
        int numberOfDancers = Integer.parseInt(console.nextLine());
        int numberOfDays = Integer.parseInt(console.nextLine());

        double movesPerDay = Math.ceil((1.0 * numberOfMoves / numberOfDays) / numberOfMoves * 100);
        double movesPerDayPercentage = 1.0 * movesPerDay / numberOfDancers;

        if (movesPerDay <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", movesPerDayPercentage);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", movesPerDayPercentage);
        }

        //main ends here
    }
}
