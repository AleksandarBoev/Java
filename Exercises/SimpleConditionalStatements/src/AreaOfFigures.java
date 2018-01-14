import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double result = -1;
        if (figure.toLowerCase().equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            result = Math.pow(side, 2);
        } else if (figure.toLowerCase().equals("rectangle")) {
            double side1 = Double.parseDouble(scanner.nextLine());
            double side2 = Double.parseDouble(scanner.nextLine());
            result = side1 * side2;
        } else if (figure.toLowerCase().equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            result = Math.PI * Math.pow(radius, 2);
        } else if (figure.toLowerCase().equals("triangle")) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            result = side * height / 2.0;
        }
        System.out.println(result);
        //code ends here
    }
}
