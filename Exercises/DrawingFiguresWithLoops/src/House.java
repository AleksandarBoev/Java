import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        //roof:
        int roofHeight = (n + 1) / 2;
        boolean even = n % 2 == 0; // even => true, odd => false
        int keremidi = (n - 1) / 2;

        if (even) {
            for (int row = 0; row < roofHeight * 2; row+=2) {
                System.out.print(concatStr(keremidi - row / 2, "-"));
                System.out.print(concatStr(row + 2, "*"));
                System.out.println(concatStr(keremidi - row / 2, "-"));
            }
        } else {
            for (int row = 1; row <= roofHeight * 2; row+=2) {
                System.out.print(concatStr(keremidi - row / 2, "-"));
                System.out.print(concatStr(row, "*"));
                System.out.println(concatStr(keremidi - row / 2, "-"));
            }
        }
        //under the roof:
        int wallHeight = n / 2;
        for (int row = 0; row < wallHeight; row++) {
//            System.out.print("|");
//            System.out.print(concatStr(n - 2, "*"));
//            System.out.println("|");
            System.out.println(house(n));
        }


        //code ends here
    }

    static String concatStr (int count, String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

    static String house (int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            if (i == 0 || i == count - 1) {
                sb.append("|");
            } else {
                sb.append("*");
            }
        }
        return sb.toString();
    }

}