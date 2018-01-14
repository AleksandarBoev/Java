import java.util.Scanner;

public class EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        if (word1.toLowerCase().equals(word2.toLowerCase())) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}
