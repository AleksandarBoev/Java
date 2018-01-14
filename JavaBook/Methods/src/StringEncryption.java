import java.util.Scanner;

public class StringEncryption {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        StringBuilder encryption = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char character = console.nextLine().charAt(0);
            encryption.append(formEncryption(character));
        }
        System.out.println(encryption.toString());

        //main ends here
    }

    static int getFirstDigit(int ascIICode) {
        int result = 0;
        while (ascIICode != 0) {
            result = ascIICode % 10;
            ascIICode /= 10;
        }
        return result;
    }

    static int getLastDigit(int ascIICode) {
        return ascIICode % 10;
    }

    static char getFirstCharacter(int ascIICode) {
        return (char) (ascIICode + getLastDigit(ascIICode));
    }

    static char getLastCharacter(int ascIICode) {
        return (char) (ascIICode - getFirstDigit(ascIICode));
    }

    static String formEncryption(int ascIICode) {
        return "" + getFirstCharacter(ascIICode) + getFirstDigit(ascIICode) + getLastDigit(ascIICode) + getLastCharacter(ascIICode);
    }



}
