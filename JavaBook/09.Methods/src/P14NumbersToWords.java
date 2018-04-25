import java.util.Scanner;

public class P14NumbersToWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfNumbers = Integer.parseInt(console.nextLine());
        for (int i = 0; i < numberOfNumbers; i++) {
            int number = Integer.parseInt(console.nextLine());
            System.out.println(letterize(number));
        }
//        breakNumber(number, digit1, digit2, digit3);
        //iznikna stranen problem: ne moga da promenqm stoinostite na vhodnite parametri (daje ako sa ot tip Object/Integer)
        //vij kakvo pishe tuk: https://stackoverflow.com/questions/489913/changing-the-values-of-variables-in-methods-java
        //main ends here
    }


    static void breakNumber(int number, int digit1, int digit2, int digit3) {
        int temporaryNumber = number;
        digit3 = temporaryNumber % 10;
        temporaryNumber /= 10;
        digit2 = temporaryNumber % 10;
        temporaryNumber /= 10;
        digit3 = temporaryNumber % 10;
    }

    static String getDigit3Word(int digit) {
        String result = "";
        switch (digit) {
            case 0:
                result = "";
                break;
            case 1:
                result = "one";
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;

        }
        return result;
    }

    static String getDigit2Word(int digit) {
        String result = "";
        switch (digit) {
            case 2:
                result = "twenty ";
                break;
            case 3:
                result = "thirty ";
                break;
            case 4:
                result = "forty ";
                break;
            case 5:
                result = "fifty ";
                break;
            case 6:
                result = "sixty ";
                break;
            case 7:
                result = "seventy ";
                break;
            case 8:
                result = "eighty ";
                break;
            case 9:
                result = "ninety ";
                break;
        }
        return result;
    }

    static String getDigit1Word(int digit) {
        String result = "";
        if (getDigit3Word(digit).equals("")) {
            return "";
        } else {
            return getDigit3Word(digit) + "-hundred ";
        }
    }

    static String getTenToNineteenWord(int digit2, int digit3) {
        int number = digit2 * 10 + digit3;
        String result = "";
        switch (number) {
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
            break;
            case 12:
                result = "twelve";
            break;
            case 13:
                result = "thirteen";
            break;
            case 14:
                result = "fourteen";
            break;
            case 15:
                result = "fifteen";
            break;
            case 16:
                result = "sixteen";
            break;
            case 17:
                result = "seventeen";
            break;
            case 18:
                result = "eighteen";
            break;
            case 19:
                result = "nineteen";
            break;
        }
        return result;
    }

    static String letterize(int number) {
        if (number > 999) {
            return "too large";
        } else if (number < -999) {
            return "too small";
        } else if (number < 100 && number >= 0) {
            return "";
        }
        boolean minus = number < 0;
        number = Math.abs(number);
        String answer = "";
        int digit3 = number %10;   // 318 => (digit1)(digit2)(digit3)
        number /= 10;
        int digit2 = number % 10;
        number /= 10;
        int digit1 = number % 10;
        boolean tenToNineteen;
        if (digit2 * 10 + digit3 >= 10 && digit2 * 10 + digit3 <= 19) {
            tenToNineteen = true;
        } else {
            tenToNineteen = false;
        }
        answer = answer + getDigit1Word(digit1);
        if (!answer.equals("") && (digit2!= 0 || digit3!= 0)) {
            answer += "and ";
        }
        if (tenToNineteen) {
            answer += getTenToNineteenWord(digit2, digit3);
        } else {
            answer += getDigit2Word(digit2) + getDigit3Word(digit3);
        }
        if (minus) {
            answer = "minus " + answer;
        }
        return answer;
    }

}
