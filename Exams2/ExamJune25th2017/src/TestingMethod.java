public class TestingMethod {
    static Integer a = 5;
    static String plsWork = "Hello, ";

    public static void main(String[] args) {

        System.out.println(a);
        increaseValue(a);
        System.out.println(a);
        System.out.println(plsWork);
        addName(plsWork);
        System.out.println(plsWork












        );
    }

    static void increaseValue(Integer number) {
        ++number;
    }

    static void addName(String name) {
        name += "Sasho";
    }

}
