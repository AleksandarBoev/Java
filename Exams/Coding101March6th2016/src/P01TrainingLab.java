import java.text.DecimalFormat;
import java.util.Scanner;

public class P01TrainingLab {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double w = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        h *= 100;
        w *= 100;

        h-= 100;
        double deskH = Math.floor(h / 70);
        double deksW = Math.floor(w / 120);

        DecimalFormat df = new DecimalFormat("#.##");

        double result = deksW * deskH - 3;
        System.out.printf("%s", df.format(result));

        //code ends here
    }
}
