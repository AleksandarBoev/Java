import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        boolean bY1 = (x == 0 || x == 3*h) && (y >= 0 && y <= h);
        boolean bY2 = (x == h || x == 2*h) && (y >= h && y <= 4*h);
        boolean borderY = bY1 || bY2;

        boolean bX1 = y == 0 && (x >= 0 && x <= 3*h);
        boolean bX2 = y == h && ((x >= 0 && x<= h) || (x >= 2*h && x<= 3*h));
        boolean bX3 = y == 4*h && (x >= h && x <= 2*h);
        boolean borderX = bX1 || bX2 || bX3;

        boolean border = borderX || borderY;

        if (border) {
            System.out.println("border");
            return;
        }

        boolean inside1 = (x > 0 && x < 3*h) && (y > 0 && y < h);
        boolean inside2 = (x > h && x < 2*h) && (y > 0 && y < 4*h);
        boolean inside = inside1 || inside2;

        if (inside) {
            System.out.println("inside");
        } else {
            System.out.println("outside");
        }

        //code ends here
    }
}
