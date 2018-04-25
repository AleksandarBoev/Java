import java.util.Scanner;

public class P06SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
//        System.out.print("n=");
        int n = Integer.parseInt(console.nextLine());
        for (int i=1; i<=n; i++)
          {
              System.out.print("*");
          }
//        purvi red ^
        // ot vtori do predposledniq red:
        System.out.println("");
        for (int i=2; i<=n-1;i++)
          {
              System.out.print("*");
              for (int j=2; j<=n-1;j++)
                {
                    System.out.print(" ");
                }
              System.out.println("*");
          }
          //posledniq red:
        for (int i=1; i<=n; i++)
          {
              System.out.print("*");
          }

    }
}
