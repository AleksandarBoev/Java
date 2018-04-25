import java.util.Scanner;

public class P05MaxNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int temporary = 0;
        int max = Integer.parseInt(console.nextLine());


        for (int i = 2; i <= n ; i++) {
            temporary = Integer.parseInt(console.nextLine());
            if (max < temporary) {
                max = temporary;
            }

        }

        System.out.println(max);

        //code ends here
    }
}