import java.util.Scanner;

public class P09PasswordGuess {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String password = myScanner.nextLine();
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.print("Welcome");
        } else {
            System.out.print("Wrong password!");
        }
    }
}
