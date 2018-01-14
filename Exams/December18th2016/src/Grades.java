import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int students = Integer.parseInt(console.nextLine());
        int numberOfGrade1 = 0;
        int numberOfGrade2 = 0;
        int numberOfGrade3 = 0;
        int numberOfGrade4 = 0;

        double average = 0;
        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(console.nextLine());
            if (grade >= 2 && grade <= 2.99) {
                numberOfGrade1 ++;
            }
            if (grade >= 3 && grade <= 3.99) {
                numberOfGrade2 ++;
            }
            if (grade >= 4 && grade <= 4.99) {
                numberOfGrade3 ++;
            }
            if (grade >= 5) {
                numberOfGrade4 ++;
            }
            average += grade;
        }

        System.out.printf("Top students: %.2f%%%n", 1.0 * numberOfGrade4 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", 1.0 * numberOfGrade3 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", 1.0 * numberOfGrade2 / students * 100);
        System.out.printf("Fail: %.2f%%%n", 1.0 * numberOfGrade1 / students * 100);
        System.out.printf("Average: %.2f", average / students);

        //main ends here
    }
}
