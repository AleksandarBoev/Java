import java.util.Scanner;

public class PointInFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());

        boolean inHorizontalRectangle = (y >= -3 && y <= 1) && (x >= 2 && x <= 12);
        boolean inVerticalRectangle = (y >= -5 && y <= 3) && (x >= 4 && x <= 10);

        if (inHorizontalRectangle || inVerticalRectangle) {
            System.out.println("in");
        } else {
            System.out.println("out");
        }

        //main ends here
    }
}
