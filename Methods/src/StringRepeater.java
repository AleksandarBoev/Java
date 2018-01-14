import java.util.Scanner;

public class StringRepeater {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String str = console.nextLine();
        int n = Integer.parseInt(console.nextLine());
        System.out.println(repeatString(str, n));

        //main ends here
    }

    static String repeatString(String str, int numberOfTimes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfTimes; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

}
