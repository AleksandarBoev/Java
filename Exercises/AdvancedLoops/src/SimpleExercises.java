import java.util.Scanner;

public class SimpleExercises {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        while (n < 1 || n > 100) {
            System.out.println("Invalid Number!");
            n = Integer.parseInt(console.nextLine());
        }
        System.out.printf("The number is: %d", n);

        //main ends here
    }
}
