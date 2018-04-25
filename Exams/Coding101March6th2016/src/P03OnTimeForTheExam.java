import java.util.Scanner;

public class P03OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int examHour = Integer.parseInt(console.nextLine());
        int examMinute = Integer.parseInt(console.nextLine());
        int arrivalHour = Integer.parseInt(console.nextLine());
        int arrivalMinute = Integer.parseInt(console.nextLine());

        int examMinutes = examHour * 60 + examMinute;
        int arrivalMinutes = arrivalHour * 60 + arrivalMinute;
        int differenceHours = Math.abs((examMinutes - arrivalMinutes) / 60);
        int differenceMinutes = Math.abs((examMinutes - arrivalMinutes) % 60);

        if (examMinutes == arrivalMinutes) {
            System.out.println("On time");
        } else if (examMinutes < arrivalMinutes) { //9:30 vs 9:40
            System.out.println("Late");
            if (differenceHours > 0) {
                System.out.printf("%d:%02d hours after the start", differenceHours, differenceMinutes);
            } else {
                System.out.printf("%d minutes after the start", differenceMinutes);
            }
        } else if (examMinutes > arrivalMinutes) { //9:30 vs 9:20
            if (examMinutes - arrivalMinutes <= 30) {
                System.out.println("On time");
                if (differenceHours > 0) {
                    System.out.printf("%d:%02d hours before the start", differenceHours, differenceMinutes);
                } else {
                    System.out.printf("%d minutes before the start", differenceMinutes);
                }
            } else {
                System.out.println("Early");
                if (differenceHours > 0) {
                    System.out.printf("%d:%02d hours before the start", differenceHours, differenceMinutes);
                } else {
                    System.out.printf("%d minutes before the start", differenceMinutes);
                }
            }
        }

        //code ends here
    }
}
