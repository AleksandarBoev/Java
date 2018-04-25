import java.util.Scanner;

public class P12IntegerToBase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        int base = Integer.parseInt(console.nextLine());
        System.out.println(getBase(number, base));

        //main ends here
    }

    static String getBase(int number, int toBase) {
//        StringBuilder sb = new StringBuilder();
        int tempNumber = number;
        int residue = 0;
        String result = "";
        while (tempNumber != 0) {
            residue = tempNumber % toBase;
            tempNumber /= toBase;
            result = residue + result;
//            sb.append(residue);
        }
        return result;
//        return sb.toString();
    }

}
