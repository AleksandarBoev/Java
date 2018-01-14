import java.util.Scanner;

public class NumberToText100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        String [] n3 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String [] weird = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String [] n2 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (number < 0 || number > 100) {
            System.out.println("invalid number");
        } else if (number < 10) {
            System.out.println(n3[number]);
        } else if (number <20) {
            System.out.println(weird[number % 10]);
        } else if (number < 100) {
            int lastNumber = number % 10;
            int firstNumber = number / 10;
            if (lastNumber != 0) {
                System.out.printf("%s %s", n2[firstNumber], n3[lastNumber]);
            } else {
                System.out.printf("%s", n2[firstNumber]);
            }
        } else {
            System.out.println("one hundred");
        }

        //code ends here
    }
}
