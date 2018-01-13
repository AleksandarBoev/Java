import java.util.Scanner;

public class IO_October26th {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("x0=");
        double x0 = Double.parseDouble(console.nextLine());
        System.out.print("alfa=");
        double alfa= Double.parseDouble(console.nextLine());
        System.out.print("kmax=");
        int kmax = Integer.parseInt(console.nextLine());
        System.out.print("eps=");
        double eps = Double.parseDouble(console.nextLine());
        int i = 0;
        double x1 = 0.0;
        double fx = 0.0;
        for (i = 0; i < kmax || Math.abs(x0 - x1) < eps; i++) {
            if (i % 2 == 0) {
                fx = ((10.0 * x0) + 1) / (2.0 * Math.sqrt(5.0 * Math.pow(x0, 2) + x0 + 6)) + 3.0 / (2.0 * Math.sqrt(3.0 * x0 + 7));
                x1 = x0 - (alfa * fx);
                System.out.println(i);
            } else {
                fx = ((10.0 * x1) + 1) / (2.0 * Math.sqrt(5.0 * Math.pow(x1, 2) + x1 + 6)) + 3.0 / (2.0 * Math.sqrt(3.0 * x1 + 7));
                x0 = x1 - (alfa * fx);
                System.out.println(i);
            }
        }
        System.out.println(i);
        System.out.println("da fak");
        //main ends here
    }
}
