import java.util.Scanner;

public class DateAfter5Days {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int day = Integer.parseInt(console.nextLine());
        int month = Integer.parseInt(console.nextLine());

        int monthDays = 0;
        switch (month) {
            case 4: case 6: case 9: case 11:
                monthDays = 30;
                break;
            case 2:
                monthDays = 28;
                break;
            default:
                monthDays = 31;
                break;
        }

        day += 5;
        if (day > monthDays) {
            day -= monthDays;
            month++;
        }
        if (month == 13) {
            month = 1;
        }
        System.out.printf("%d.%2d", day, month);
//        System.out.printf("%2f", (double) month);


        //main ends here
    }
}
