import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double p1h = p1 * h;
        double p2h = p2 * h;
        if (p1h + p2h > v) {
            double overflow = (p1h + p2h) - v;
            System.out.printf("For %f hours the pool overflows with %f liters", h, overflow);
        } else {
            double vp = p1h + p2h;
//            long percentage1 = Math.round((p1h / vp) * 100);
//            long percentage2 = Math.round((p2h / vp) * 100);
            double percentage1 = Math.floor((p1h / vp) * 100);
            double percentage2 = Math.floor((p2h / vp) * 100);
//            long percentageFull = Math.round((vp / v) * 100);
            double percentageFull = Math.floor((vp / v) * 100);
            System.out.printf("The pool is %f%% full. Pipe 1: %f%%. Pipe 2: %f%%.", percentageFull, percentage1, percentage2);
        }
        //code ends here
    }
}
