import java.util.Scanner;

public class P02SignOfIntegerNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        signMessage(n);
        //main ends here
    }

    static String returnSign(int number) {
        String answer = "";
        if (number == 0) {
            answer = "zero";
//            return "zero";
        } else if (number < 0) {
            answer = "negative";
//            return "negative";
        } else if (number > 0) {
            answer =  "positive";
//            return "positive";
        }
        return answer;
    }

    static void signMessage(int number) {
        System.out.printf("The number %d is %s.", number, returnSign(number));
    }

}
