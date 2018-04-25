import java.util.Scanner;

public class P06LettersCombinations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char characterStart = console.nextLine().charAt(0);
        char characterEnd = console.nextLine().charAt(0);
        char characterMiss = console.nextLine().charAt(0);

        int count = 0;

        for (char i = characterStart; i <= characterEnd; i++) {
            if (i == characterMiss) {
                continue;
            }
            for (char j = characterStart; j <= characterEnd; j++) {
                if (j == characterMiss) {
                    continue;
                }
                for (char k = characterStart; k <= characterEnd; k++) {
                    if (k == characterMiss) {
                        continue;
                    }
                    System.out.print("" + i + j + k + " ");
                    count++;
                }
            }
        }
        System.out.println(count);

        //main ends here
    }
}
