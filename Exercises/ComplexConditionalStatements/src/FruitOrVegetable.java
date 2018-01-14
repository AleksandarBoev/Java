import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String natureFood = scanner.nextLine();
//        String result = "";
        if (natureFood.equals("banana") || natureFood.equals("apple") || natureFood.equals("kiwi") || natureFood.equals("cherry") ||
                natureFood.equals("lemon") || natureFood.equals("grapes")) {
//            result = "fruit";
            System.out.println("fruit");
        } else if (natureFood.equals("carrot") || natureFood.equals("tomato") || natureFood.equals("cucumber") ||
                natureFood.equals("pepper")) {
//            result = "vegetable";
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
//            result = "unknown";
        }
//        System.out.println(result);
            //code ends here
    }
}
