import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());
        if (speed > 1000) {
            System.out.print("extremely fast");
        } else if (speed > 150) {
            System.out.print("ultra fast");
        } else if (speed > 50) {
            System.out.print("fast");
        } else if (speed > 10){
            System.out.print("average");
        } else {
            System.out.print("slow");
        }
    }
}
