import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double speed = Double.parseDouble(console.nextLine());
        double time1 = Double.parseDouble(console.nextLine()) / 60.0; //napravo gi prevrushtam v chasove
        double time2 = Double.parseDouble(console.nextLine()) / 60.0;
        double time3 = Double.parseDouble(console.nextLine()) / 60.0;

        double totalDistance = 0;

        totalDistance = speed * time1;
        speed += speed * 0.1;
        totalDistance += speed * time2;
        speed -= speed * 0.05;
        totalDistance += speed * time3;

        System.out.printf("%.2f", totalDistance);

        //main ends here
    }
}
