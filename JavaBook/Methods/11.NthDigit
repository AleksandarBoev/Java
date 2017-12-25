import java.util.Scanner;

public class NthDigit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        int index = Integer.parseInt(console.nextLine());
        System.out.println(getDigit(number, index));
//        main ends here
    }

    static int getDigit(int number, int index) {
        int temporary = number;
        int count = 0;
        int result = 0;
        while (count != index) {
            count++;
            result = temporary % 10;
            temporary /= 10;
        }
        return result;
    }

}
