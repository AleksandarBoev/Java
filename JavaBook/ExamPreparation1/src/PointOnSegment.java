import java.util.Scanner;

public class PointOnSegment {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        int point = Integer.parseInt(console.nextLine());

        boolean in = (point >= first && point <= second) || (point <= first && point >= second);
        int nearestDistance = Math.min(Math.abs(point - first), Math.abs(point - second));

        if (in) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }
        System.out.println(nearestDistance);

        //main ends here
    }
}
