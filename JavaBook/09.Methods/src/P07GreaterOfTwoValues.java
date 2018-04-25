import java.util.Scanner;

public class P07GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String varType = console.nextLine();
        switch (varType) {
            case "int":
                int n1 = Integer.parseInt(console.nextLine());
                int n2 = Integer.parseInt(console.nextLine());
                System.out.println(getGreaterValue(n1, n2));
                break;
            case "char":
                char c1 = console.nextLine().charAt(0);
                char c2 = console.nextLine().charAt(0);
                System.out.println(getGreaterValue(c1, c2));
                break;
            case "string":
                String s1 = console.nextLine();
                String s2 = console.nextLine();
                System.out.println(getGreaterValue(s1, s2));
                break;
        }

        //main ends here
    }

    static int getGreaterValue(int number1, int number2) {
        if (number1 >= number2) {
            return number1;
        } else {
            return number2;
        }
    }

    static char getGreaterValue(char character1, char character2) {
        if (character1 >= character2) {
            return character1;
        } else {
            return character2;
        }
    }

    static String getGreaterValue(String str1, String str2) {
        if (str1.compareTo(str2) == 1 && str1.compareTo(str2) == 0) {
            return str1;
        } else {
            return str2;
        }
    }

}
