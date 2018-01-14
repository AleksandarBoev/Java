import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int doctors = 7;
        int days = Integer.parseInt(scanner.nextLine());

        int checkedPatients = 0;
        int uncheckedPatients = 0;
        int patients = 0;

        for (int i = 1; i <= days; i++) {

            if (i % 3 == 0) {
                if (checkedPatients < uncheckedPatients) {
                    ++doctors;
                }
//                checkedPatients = 0;
//                uncheckedPatients = 0;
            }

//            System.out.print("How many patients for day " + i + ": ");
            patients = Integer.parseInt(scanner.nextLine());
            if (patients <= doctors) {
                checkedPatients += patients;
            } else {
                checkedPatients += doctors;
                uncheckedPatients += patients - doctors;
            }
        }
        System.out.printf("Treated patients: %d.%n", checkedPatients);
        System.out.printf("Untreated patients: %d.", uncheckedPatients);



        //code ends here
    }
}
