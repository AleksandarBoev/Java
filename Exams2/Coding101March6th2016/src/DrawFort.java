import java.util.Scanner;

public class DrawFort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int castleWidth = 2 * n;
        int castleWalls = n - 3;  //predposledniqt red e problemen
        int castlePointers = n / 2;
        int castleMiddle = castleWidth - 4 - castlePointers * 2; // -4 zashtoto /\/\
        int castleBase = castlePointers;

        //top part:
        System.out.print("/");
        System.out.print(concatStr(castlePointers, "^"));
        System.out.print("\\");
        System.out.print(concatStr(castleMiddle, "_"));
        System.out.print("/");
        System.out.print(concatStr(castlePointers, "^"));
        System.out.println("\\");
        //middle part:
        for (int row = 0; row < castleWalls; row++) {
            for (int col = 0; col < castleWidth; col++) {
//                col == 0 || col == castleWidth - 1 ? System.out.print("|") : System.out.print(" ");
                if (col == 0 || col == castleWidth - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //almost bottom part:
        System.out.print("|");
        System.out.print(concatStr(castleBase + 1, " "));
        System.out.print(concatStr(castleMiddle, "_"));
        System.out.print(concatStr(castleBase + 1, " "));
        System.out.println("|");
        //bottom part:
        System.out.print("\\");
        System.out.print(concatStr(castleBase, "_"));
        System.out.print("/");
        System.out.print(concatStr(castleMiddle, " "));
        System.out.print("\\");
        System.out.print(concatStr(castleBase, "_"));
        System.out.println("/");


        //code ends here
    }

    static String concatStr (int count, String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

}
