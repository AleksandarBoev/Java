import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double startSpeed = Double.parseDouble(console.nextLine());
        double time1 = Double.parseDouble(console.nextLine()) / 60.0;
        double time2 = Double.parseDouble(console.nextLine()) / 60.0;
        double time3 = Double.parseDouble(console.nextLine()) / 60.0;

        double distance = startSpeed * time1;
        startSpeed += startSpeed * 0.1;
        distance += startSpeed * time2;
        startSpeed -= startSpeed * 0.05;
        distance += startSpeed * time3;

        System.out.printf("%.2f", distance);
        //main ends here
    }
}
