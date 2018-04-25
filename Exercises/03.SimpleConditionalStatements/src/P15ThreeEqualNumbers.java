import java.util.Scanner;

public class P15ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        if (n1 == n2 && n1 == n3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
