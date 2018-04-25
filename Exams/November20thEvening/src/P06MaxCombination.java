import java.util.Scanner;

public class P06MaxCombination {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int interval1 = Integer.parseInt(console.nextLine());
        int interval2 = Integer.parseInt(console.nextLine());
        int maxCombos = Integer.parseInt(console.nextLine());

        int numberOfCombos = 0;

        for (int i = interval1; i <= interval2; i++) {
            for (int j = interval1; j <= interval2 ; j++) {
                System.out.printf("<%d-%d>", i, j);
                numberOfCombos++;
                if (numberOfCombos == maxCombos) {
                    return;
                }
            }
        }

        //code ends here
    }
}
