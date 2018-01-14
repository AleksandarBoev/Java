import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int temporary = 0;
        int min = Integer.parseInt(console.nextLine());


        for (int i = 2; i <= n ; i++) {
            temporary = Integer.parseInt(console.nextLine());
            if (min > temporary) {
                min = temporary;
            }

        }

        System.out.println(min);

        //code ends here
    }
}