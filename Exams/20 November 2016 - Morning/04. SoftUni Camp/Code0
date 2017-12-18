import java.util.Scanner;

public class SoftUniCamp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int people = 0;
        int car = 0;
        int minibus = 0;
        int smallBus = 0;
        int bigBuss = 0;
        int train = 0;

        int numberOfGroups = Integer.parseInt(console.nextLine());
        for (int i = 0; i < numberOfGroups; i++) {
            int peopleInGroup = Integer.parseInt(console.nextLine());
            if (peopleInGroup <= 5) {
                car += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                minibus += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                smallBus += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                bigBuss += peopleInGroup;
            } else {
                train += peopleInGroup;
            }

            people += peopleInGroup;
        }

        System.out.printf("%.2f%%%n", 1.0 * car / people * 100.0);
        System.out.printf("%.2f%%%n", 1.0 * minibus / people * 100.0);
        System.out.printf("%.2f%%%n", 1.0 * smallBus / people * 100.0);
        System.out.printf("%.2f%%%n", 1.0 * bigBuss / people * 100.0);
        System.out.printf("%.2f%%", 1.0 * train / people * 100.0);


        //code ends here
    }
}
