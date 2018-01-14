import java.util.Scanner;

public class SmartLily {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int age = Integer.parseInt(console.nextLine());
        double washingMachinePrice = Double.parseDouble(console.nextLine());
        int toyPrice = Integer.parseInt(console.nextLine());

        int money = 0;
        int savings = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                money += 10;
                savings += money;
                savings--;  // kradliv brat na Lili
            } else  {
                savings += toyPrice;
            }
        }

        double difference = savings - washingMachinePrice;
        if (difference < 0) {
            System.out.printf("No! %.2f", Math.abs(difference));
        } else {
            System.out.printf("Yes! %.2f", difference);
        }

        //code ends here
    }
}