import java.util.Scanner;

public class Bricks {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int bricks = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());
        int volume = Integer.parseInt(console.nextLine());
        int numberOfTrips = 0;

        while (bricks > 0) {
            bricks -= workers * volume;
            numberOfTrips++;
        }
        System.out.println(numberOfTrips);

        //main ends here
    }
}
