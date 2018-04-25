import java.util.Scanner;

public class P02ExcellentOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        System.out.println(grade >= 5.5 ? "Excellent!" : "Not excellent.");
        //code ends here
    }
}
