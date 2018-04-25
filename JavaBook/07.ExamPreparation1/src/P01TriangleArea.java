import java.util.Scanner;

public class P01TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int x1 = Integer.parseInt(console.nextLine());
        int y1 = Integer.parseInt(console.nextLine());
        int x2 = Integer.parseInt(console.nextLine());
        int y2 = Integer.parseInt(console.nextLine());
        int x3 = Integer.parseInt(console.nextLine());
        int y3 = Integer.parseInt(console.nextLine());

        int height = Math.abs(y1 - y2);
        int side = Math.abs(x3 - x2);

        double triangleArea = (height * side) / 2.0;
        System.out.println(triangleArea);

        //main ends here
    }
}
