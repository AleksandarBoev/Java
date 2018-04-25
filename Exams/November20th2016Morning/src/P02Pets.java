import java.text.DecimalFormat;
import java.util.Scanner;

public class P02Pets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int daysGone = Integer.parseInt(console.nextLine());
        int food = Integer.parseInt(console.nextLine());
        double dogFood = Double.parseDouble(console.nextLine());
        double catFood = Double.parseDouble(console.nextLine());
        double tortoiseFood = Double.parseDouble(console.nextLine()) / 1000.0; //GRAMS, NEED TO BE DIVERTED TO KILOGRAMS

        double dog = dogFood * daysGone;
        double cat = catFood * daysGone;
        double tortoise = tortoiseFood * daysGone;

        double foodNeeded = dog + cat + tortoise;
        DecimalFormat df = new DecimalFormat("#.###########");

        if (foodNeeded > food) {
            System.out.printf("%s more kilos of food are needed.", df.format(Math.ceil(foodNeeded - food)));
        } else {
            System.out.printf("%s kilos of food left. ", df.format(Math.floor(food - foodNeeded)));
        }

        //code ends here
    }
}
