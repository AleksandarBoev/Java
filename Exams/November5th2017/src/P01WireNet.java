import java.util.Scanner;

public class P01WireNet {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int areaLength = Integer.parseInt(console.nextLine());
        int areaWidth = Integer.parseInt(console.nextLine());
        double netHeight = Double.parseDouble(console.nextLine());
        double netPricePerMeter = Double.parseDouble(console.nextLine());
        double netWeightSquareMeter = Double.parseDouble(console.nextLine());

        int circumference = 2 * areaLength + 2 * areaWidth;
        double netPrice = circumference * netPricePerMeter;
        double area = circumference * netHeight;
        double netWight = area * netWeightSquareMeter;

        System.out.println(circumference);
        System.out.printf("%.2f%n", netPrice);
        System.out.printf("%.3f", netWight);

        //main ends here
    }
}
