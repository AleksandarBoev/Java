import java.util.Scanner;

public class P07FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        if (!fruit.equals("banana") && !fruit.equals("apple") && !fruit.equals("orange") && !fruit.equals("grapefruit") && !fruit.equals("kiwi") &&
                !fruit.equals("pineapple") && !fruit.equals("grapes")) {
            System.out.println("error");
            return;
        }

        if (!dayOfWeek.equals("Monday") && !dayOfWeek.equals("Tuesday") && !dayOfWeek.equals("Wednesday") && !dayOfWeek.equals("Thursday") && !dayOfWeek.equals("Friday")
                && !dayOfWeek.equals("Saturday") && !dayOfWeek.equals("Sunday")) {
            System.out.println("error");
            return;
        }

        double price = -1;

        if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            }


        } else { // workdays:
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            }


        }

        System.out.println(quantity * price);
        //code ends here
    }
}
