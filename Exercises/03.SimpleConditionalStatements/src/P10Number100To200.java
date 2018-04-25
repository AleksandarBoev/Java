import java.util.Scanner;

public class P10Number100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbah = Integer.parseInt(scanner.nextLine());
        if (numbah > 200) {
            System.out.println("Greater than 200");
        } else if (numbah >= 100) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Less than 100");
        }
    }
}
