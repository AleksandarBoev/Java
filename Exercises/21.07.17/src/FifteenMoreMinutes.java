import java.util.Scanner;

public class FifteenMoreMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        minutes += 15;
        int bonusHours = minutes / 60;
        minutes = minutes % 60;
        hours += bonusHours;
        hours = hours % 24;
        System.out.printf("%d:%02d", hours, minutes);
    }
}
