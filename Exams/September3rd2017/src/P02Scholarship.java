import java.util.Scanner;

public class P02Scholarship {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double income = Double.parseDouble(console.nextLine());
        double averageGrade = Double.parseDouble(console.nextLine());
        double minimalIncome = Double.parseDouble(console.nextLine());
        boolean getsSocialScholarship = income < minimalIncome && averageGrade > 4.5;
        boolean getsExcellentScholarship = averageGrade >= 5.5;


        if (!getsExcellentScholarship && !getsSocialScholarship) {
            System.out.println("You cannot get a scholarship!");
        } else {
            double socialScholarship = -1;
            double excellentScholarship = -1;
            if (getsExcellentScholarship) {
                excellentScholarship = averageGrade * 25.0;
            }
            if (getsSocialScholarship) {
                socialScholarship = minimalIncome * 0.35;
            }
            if (socialScholarship >= excellentScholarship) {
                System.out.printf("You get a Social scholarship %d BGN", (int) socialScholarship);
            } else {
                System.out.printf("You get a scholarship for excellent results %d BGN", (int) excellentScholarship);
            }


        }

        //main ends here
    }
}