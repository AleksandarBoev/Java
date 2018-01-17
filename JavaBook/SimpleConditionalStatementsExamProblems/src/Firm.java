import java.util.Scanner;

public class Firm { // Programming Basics Exam - 28 August 2016
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(console.nextLine());
        int days = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());

        int hoursWork = days * 10 * workers;
        hoursWork -= hoursWork * 0.1;

        if (hoursWork >= hoursNeeded) {
            System.out.printf("Yes!%d hours left.", hoursWork - hoursNeeded);
        } else {
            System.out.printf("Not enough time!%d hours needed.", hoursNeeded - hoursWork);
        }


        //main ends here
    }
}
