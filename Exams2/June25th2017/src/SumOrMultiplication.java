import java.util.Scanner;

public class SumOrMultiplication {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int count = 0;
        int controlNumber = Integer.parseInt(console.nextLine());
        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    if ((a < b && b < c) && (a + b + c == controlNumber)) {
                        System.out.printf("%d + %d + %d = %d%n", a, b, c, controlNumber);
                        count ++;
                    }
                    if ((a > b && b > c) && (c * b * a == controlNumber)) {
                        System.out.printf("%d * %d * %d = %d%n", a, b, c, controlNumber);
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No!");
        }
        //main ends here
    }
}
