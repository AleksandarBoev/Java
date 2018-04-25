import java.util.Scanner;

public class P03SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());
        int playTime = ((365 - holidays) * 63) + (holidays * 127);
        int hours = Math.abs((30000 - playTime) / 60);
        int minutes = Math.abs((30000 - playTime) % 60);
        if (playTime > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {
//            hours = Math.abs(hours);  //ne razbiram zashto ne raboti tuk
//            minutes = Math.abs(minutes);
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}
