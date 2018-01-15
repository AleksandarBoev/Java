import java.util.Scanner;

public class Sums3Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n1 = Integer.parseInt(console.nextLine());
        int n2 = Integer.parseInt(console.nextLine());
        int n3 = Integer.parseInt(console.nextLine());

//        boolean sumOfTwoEqualsThird = (n1 + n2 == n3) || (n1 + n3 == n2) || (n2 + n3 == n1);
        if (n3 + n2 == n1) {
            System.out.printf("%d + %d = %d", Math.min(n3, n2), Math.max(n3, n2), n1);
        } else if (n3 + n1 == n2) {
            System.out.printf("%d + %d = %d", Math.min(n3, n1), Math.max(n3, n1), n2);
        } else if (n2 + n1 == n3) {
            System.out.printf("%d + %d = %d", Math.min(n2, n1), Math.max(n2, n1), n3);
        } else {
            System.out.println("No");
        }
        //main ends here
    }
}
