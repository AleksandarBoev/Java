import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int difference = (examHour * 60 + examMinute) - (arrivalHour * 60 + arrivalMinute); //vuv vid na minuti e

        int hours = 0;
        int minutes = 0;

        if (difference < 0) {
            difference = Math.abs(difference); //hours = ... ; minutes = ... ; щяха да бъдат извън тялото на проверките ако не беше за абсолютната стойност тук
            hours = difference / 60;
            minutes = difference % 60;
            System.out.println("Late");
            if (hours != 0) {
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            } else {
                System.out.printf("%d minutes after the start", minutes);
            }
            //if late ^
        } else if (difference <= 30) {
            hours = difference / 60;
            minutes = difference % 60;
            if (hours == 0 && minutes == 0) {  //nqma sluchai za printirane na kolko chasa po-rano e doshul, zashtoto shte vlezne v kategoriq "early"
                System.out.println("On time");
            } else {
                System.out.printf("On time%n%d minutes before the start", minutes);
            }

        } else {
            hours = difference / 60;
            minutes = difference % 60;
            if (hours != 0) {
                System.out.printf("Early%n%d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("Early%n%d minutes before the start", minutes); //ako izkara problem moje bi iska minutite da sa %02d
            }

        }



        //code ends here
    }
}
