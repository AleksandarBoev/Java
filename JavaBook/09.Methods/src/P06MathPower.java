import java.text.DecimalFormat;
import java.util.Scanner;

public class P06MathPower {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double number = Double.parseDouble(console.nextLine());
        double toThePowerOf = Double.parseDouble(console.nextLine());
        DecimalFormat df = new DecimalFormat("#.########");
        System.out.println(df.format(getPower(number, toThePowerOf)));
//        System.out.println((long) getPower(number, toThePowerOf));
        //main ends here
    }

    static double getPower(double number, double toThePowerOf) {
        if (toThePowerOf == 0) {
            return 1;
        }
        double result = 1;
        for (int i = 1; i <= toThePowerOf; i++) {
            result *= number;
        }
        return result;
    }

}
