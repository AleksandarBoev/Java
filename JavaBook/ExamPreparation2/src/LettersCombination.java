import java.util.Scanner;

public class LettersCombination {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char start = console.nextLine().charAt(0);
        char stop = console.nextLine().charAt(0);
        char exclude = console.nextLine().charAt(0);

        int count = 0;

        for (char character1 = start; character1 <= stop; character1++) {
            if (character1 == exclude) {
                continue;
            }
            for (char character2 = start; character2 <= stop; character2++) {
                if (character2 == exclude) {
                    continue;
                }
                for (char character3 = start; character3 <= stop; character3++) {
                    if (character3 != exclude) {
                        System.out.printf("%c%c%c ", character1, character2, character3); // 80/100 лимит време на тест 3 и 10
//                        System.out.print("" + character1 + character2 + character3 + " "); // 100/100
                        count ++;
                    }
                }
            }
        }
        System.out.print(count);

        //main ends here
    }
}
