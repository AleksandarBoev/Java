import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.##########");
        double side = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());
        double result = calcTriangleArea(side, height);
        System.out.println(df.format(result));

        //main ends here
    }

    static double calcTriangleArea(double side, double height) {
        return (side * height) / 2.0;
    }

}
