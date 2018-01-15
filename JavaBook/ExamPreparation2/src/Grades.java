import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(console.nextLine());

        int studentsExcellent = 0;
        int studentsVeryGood = 0;
        int studentsGood = 0;
        int studentsFailed = 0;
        double averageGrade = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            double grade = Double.parseDouble(console.nextLine());
            if (grade >= 5) {
                studentsExcellent++;
            } else if (grade >= 4) {
                studentsVeryGood++;
            } else if (grade >= 3) {
                studentsGood++;
            } else {
                studentsFailed++;
            }
            averageGrade += grade;
        }

        averageGrade /= numberOfStudents;
        System.out.printf("Top students: %.2f%%%n", (double) studentsExcellent / numberOfStudents * 100.0);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (double) studentsVeryGood / numberOfStudents * 100.0);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (double) studentsGood / numberOfStudents * 100.0);
        System.out.printf("Fail: %.2f%%%n", (double) studentsFailed / numberOfStudents * 100.0);
        System.out.printf("Average: %.2f", averageGrade);

        //main ends here
    }
}
