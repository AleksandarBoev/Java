import java.util.Scanner;

public class P08MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mm = 1000;
        double cm = 100;
        double mi = 0.000621371192;
        double in = 39.3700787;
        double km = 0.001;
        double ft = 3.2808399;
        double yd = 1.0936133;
        double distance = Double.parseDouble(scanner.nextLine());
        String unit1 = scanner.nextLine();
        String unit2 = scanner.nextLine();

        if (unit1.equals("mm")) {
            distance = distance / mm;
        } else if (unit1.equals("cm")) {
            distance = distance / cm;
        } else if (unit1.equals("mi")) {
            distance = distance / mi;
        } else if (unit1.equals("in")) {
            distance = distance / in;
        } else if (unit1.equals("km")) {
            distance = distance / km;
        } else if (unit1.equals("ft")) {
            distance = distance / ft;
        } else if (unit1.equals("yd")) {
            distance = distance / yd;
        }

        if (unit2.equals("mm")) {
            distance = distance * mm;
        } else if (unit2.equals("cm")) {
            distance = distance * cm;
        } else if (unit2.equals("mi")) {
            distance = distance * mi;
        } else if (unit2.equals("in")) {
            distance = distance * in;
        } else if (unit2.equals("km")) {
            distance = distance * km;
        } else if (unit2.equals("ft")) {
            distance = distance * ft;
        } else if (unit2.equals("yd")) {
            distance = distance * yd;
        }

        System.out.printf("%f", distance);
        //code ends here
    }
}
