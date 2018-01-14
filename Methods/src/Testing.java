import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

//        Integer n = Integer.parseInt(console.nextLine());
//        changeValue(n);
//        System.out.println(n); //not changed
        String hello = "Pizza";
        changeString(hello);
        System.out.println(hello); //not changed
        Object n1 = 5;
        changeValue2(n1);
        System.out.println(n1); //NOT CHANGED AAAAAA
        //main ends here
    }

    static void changeValue(Integer variable) {
        variable = 0;
    }

    public static String changeString(String variable) {
        variable = "I is the best";
        return "hi";
    }

    public static void changeValue2(Object variable) {
        variable = 0;
    }

}
