import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int oneLevaCoinCount = Integer.parseInt(console.nextLine());
        int twoLevaCoinCount = Integer.parseInt(console.nextLine());
        int fiveLevaPaperCount = Integer.parseInt(console.nextLine());
        int sum = Integer.parseInt(console.nextLine());

        for (int oneLeva = 0; oneLeva <= oneLevaCoinCount; oneLeva++) {
            for (int twoLeva = 0; twoLeva <= twoLevaCoinCount; twoLeva++) {
                for (int fiveLeva = 0; fiveLeva <= fiveLevaPaperCount; fiveLeva++) {
                    int sumCombination = oneLeva * 1 + twoLeva * 2 + fiveLeva * 5;
                    if (sum == sumCombination) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", oneLeva, twoLeva, fiveLeva, sum);
                    }
                }
            }
        }

        //main ends here
    }
}