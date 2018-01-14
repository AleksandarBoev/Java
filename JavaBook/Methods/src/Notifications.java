import java.util.Scanner;

public class Notifications {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(console.nextLine());
        printMessages(numberOfMessages, console);
        //main ends here
    }

    static String returnStr(int count, String character) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(character);
        }
        return sb.toString();
    }

    static void printErrorMessage(String error, String reason, String errorCode) {
        String firstMessage = "Error: Failed to execute " + error + ".";
        System.out.println(firstMessage);
        System.out.println(returnStr(firstMessage.length(), "="));
        System.out.printf("Reason: %s.%n", reason);
        System.out.printf("Error code: %s.%n", errorCode);
    }

    static void printWarningMessage(String warning) {
        String firstMessage = "Warning: " + warning + ".";
        System.out.println(firstMessage);
        System.out.println(returnStr(firstMessage.length(), "="));
    }

    static void printSuccessMessage(String successfulAction, String successMessage) {
        String firstMessage = "Successfully executed " + successfulAction + ".";
        System.out.println(firstMessage);
        System.out.println(returnStr(firstMessage.length(), "="));
        System.out.println(successMessage + ".");
    }

    static void printMessages(int numberOfMessages, Scanner console) {
        String message = "";
        for (int i = 0; i < numberOfMessages; i++) {
            message = console.nextLine().toLowerCase();
            switch (message) {
                case "error":
                    String error = console.nextLine();
                    String result = console.nextLine();
                    String errorCode = console.nextLine();
                    printErrorMessage(error, result, errorCode);
                    break;
                case "warning":
                    String warning = console.nextLine();
                    printWarningMessage(warning);
                    break;
                case "success":
                    String successfulAction = console.nextLine();
                    String successMessage = console.nextLine();
                    printSuccessMessage(successfulAction, successMessage);
                    break;
            }
            System.out.println();
        }
        //printMessage method ends here
    }

}
