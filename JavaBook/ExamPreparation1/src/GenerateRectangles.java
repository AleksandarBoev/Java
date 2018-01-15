import java.util.Scanner;

public class GenerateRectangles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int m = Integer.parseInt(console.nextLine());

        int left = 0;
        int right = 0;
        int top = 0;
        int bottom = 0;
        int length = 0;
        int height = 0;
        int area = 0;
        boolean atLeastOnce = false;

        for (left = -n; left < right ; left++) {
            for (top = -n; top < bottom; top++) {
                for (right = left + 1; right <= n; right++) {
                    for (bottom = top + 1; bottom <= n; bottom++) {
                        length = Math.abs(right - left);
                        height = Math.abs(top - bottom);
                        area = length * height;
                        if (area >= m) {
                            System.out.printf("(%d, %d) (%d, %d) -> %d%n", left, top, right, bottom, area);
                            atLeastOnce = true;
                        }
                    }
                }
            }
        }

        if (!atLeastOnce) {
            System.out.println("No");
        }

        //main ends here
    }
}
