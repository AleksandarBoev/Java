import java.util.Scanner;

public class MoneyPrize {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int projectParts = Integer.parseInt(console.nextLine());
        double prizeMoneyPerPoint = Double.parseDouble(console.nextLine());
        int points = 0;

        double totalPrize = 0;

        for (int projectPart = 1; projectPart <= projectParts; projectPart++) {
            points = Integer.parseInt(console.nextLine());
            if (projectPart % 2 == 0) {
                points *= 2;
            }
            totalPrize += prizeMoneyPerPoint * points;
        }

        System.out.printf("The project prize was %.2f lv.", totalPrize);

        //main ends here
    }
}
