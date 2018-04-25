import java.util.Scanner;

public class P01PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine().toLowerCase();
        String greeting = "lalallalala";
        if (age < 16) {
            if (gender.equals("m")) {
                greeting = "Master";
            } else {
                greeting = "Miss";
            }
        } else { //if age >= 16
            if (gender.equals("m")) {
                greeting = "Mr.";
            } else {
                greeting = "Ms.";
            }
        }
        System.out.println(greeting);
        //code ends here
    }
}