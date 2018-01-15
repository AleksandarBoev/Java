import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("Enter even number: ");
            try {
                n = Integer.parseInt(console.nextLine());
                if (n % 2 == 0) {
                    System.out.println("Even number entered: " + n);
                    return;
                } else {
                    System.out.println("The number is not even.");
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        } while (true);

        //main ends here
    }
}
