import java.text.DecimalFormat;
import java.util.Scanner;

public class P11OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.##############################################"); //df.format(double);
        double oddSum = 0;
        double oddMax = -Double.MAX_VALUE;//-100000000.0;//Double.MIN_VALUE;
        double oddMin = Double.MAX_VALUE;//Double.MAX_VALUE;
        double evenSum = 0;
        double evenMax = -Double.MAX_VALUE;//Double.MIN_VALUE;
        double evenMin = Double.MAX_VALUE; // ako ostane sushtata stoinost znachi nqma chetna minimalna stoinost
        int n = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= n ; i++) {
            double number = Double.parseDouble(console.nextLine());

            if (i % 2 == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            } else {  //nechetni
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            }

        }

        System.out.println("OddSum=" + df.format(oddSum));
        if (oddMin != Double.MAX_VALUE) {
            System.out.println("OddMin=" + df.format(oddMin));
        } else {
            System.out.println("OddMin=No");
        }
        if (oddMax != -Double.MAX_VALUE) {
            System.out.println("OddMax=" + df.format(oddMax));
        } else {
            System.out.println("OddMax=No");
        }
        System.out.println("EvenSum=" + df.format(evenSum));
        if (evenMin != Double.MAX_VALUE) {
            System.out.println("EvenMin=" + df.format(evenMin));
        } else {
            System.out.println("EvenMin=No");
        }
        if (evenMax != -Double.MAX_VALUE) {
            System.out.println("EvenMax=" + df.format(evenMax));
        } else {
            System.out.println("EvenMax=No");
        }

//        double d = Double.parseDouble(console.nextLine());
//        System.out.println(d);
//        System.out.println("Hello " + df.format(d));


        //code ends here
    }
}
