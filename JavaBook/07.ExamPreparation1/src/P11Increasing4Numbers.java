import java.util.Scanner;

public class P11Increasing4Numbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        boolean printedOnce = false;

        for (int n1 = a; n1 < b; n1++) {
            for (int n2 = n1 + 1; n2 < b; n2++) {
                for (int n3 = n2 + 1; n3 < b; n3++) {
                    for (int n4 = n3 + 1; n4 <= b; n4++) {
                        if (n1 < n2 && n2 < n3 && n3 < n4) {
                            System.out.printf("%d%n%d%n%d%n%d%n", n1, n2, n3, n4);
                            printedOnce = true;
                        }
                    }
                }
            }
        }
        if (!printedOnce) {
            System.out.println("No");
        }

        //meain ends here
    }
}
