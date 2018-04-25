import java.util.Scanner;

public class P07SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int sec1 = Integer.parseInt(scanner.nextLine());
        int sec2 = Integer.parseInt(scanner.nextLine());
        int sec3 = Integer.parseInt(scanner.nextLine());
        int sumseconds = sec1 + sec2 + sec3;
        int minutes = sumseconds / 60;
        int seconds = sumseconds % 60;
        System.out.printf("%d:%02d", minutes, seconds);
        //code ends here
    }
}
