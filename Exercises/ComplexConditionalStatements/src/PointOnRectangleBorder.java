import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        // x1 < x2 , y1 < y2
//        boolean inside = x >= x1 && x <= x2 && y >= y1 && y <= y2;
        boolean rightBorder =  (x == x1 || x == x2) && (y >= y1 && y <= y2);
        boolean leftBorder = (y == y1 || y == y2) && (x >= x1 && x <= x2);
        if (rightBorder || leftBorder) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
        //code ends here
    }
}