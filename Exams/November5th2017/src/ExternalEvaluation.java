import java.util.Scanner;

public class ExternalEvaluation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(console.nextLine());
        int poorMark = 0;
        int satisfactoryMark = 0;
        int goodMark = 0;
        int veryGoodMark = 0;
        int excellentMark = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            double grade = Double.parseDouble(console.nextLine());
            if (grade >= 0 && grade <= 22.5) {
                poorMark++;
            } else if (grade > 22.5 && grade <= 40.5) {
                satisfactoryMark++;
            } else if (grade > 40.5 && grade <= 58.5) {
                goodMark++;
            } else if (grade > 58.5 && grade <= 76.5) {
                veryGoodMark++;
            } else if (grade > 76.5 && grade <= 100) {
                excellentMark++;
            }
        }
        double result = 1.0 * poorMark / numberOfStudents * 100;
        System.out.printf("%.2f%% poor marks%n", result);
        result = 1.0 * satisfactoryMark / numberOfStudents * 100;
        System.out.printf("%.2f%% satisfactory marks%n", result);
        result = 1.0 * goodMark / numberOfStudents * 100;
        System.out.printf("%.2f%% good marks%n", result);
        result = 1.0 * veryGoodMark / numberOfStudents * 100;
        System.out.printf("%.2f%% very good marks%n", result);
        result = 1.0 * excellentMark / numberOfStudents * 100;
        System.out.printf("%.2f%% excellent marks%n", result);


        //main ends here
    }
}