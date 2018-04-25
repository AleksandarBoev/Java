import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int holidays = Integer.parseInt(console.nextLine());
        boolean enoughSleep;

        int sleepTime = (365 - holidays) * 63 + holidays * 127;
        int difference = sleepTime - 30000;

        if (difference > 0) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", Math.abs(difference / 60), Math.abs(difference % 60));
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", Math.abs(difference / 60), Math.abs(difference % 60));
        }

        //main ends here
    }
}
