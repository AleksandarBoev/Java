import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(console.nextLine());
        int liveUntil = Integer.parseInt(console.nextLine());

        int age = 18;
        double moneySpent = 0;

        for (int i = 1800; i <= liveUntil; i++) {
            if (i % 2 == 0) {
                moneySpent += 12000;
            } else {
                moneySpent += 12000 + (age * 50);
            }
            age++;
        }

        if (moneySpent <= inheritedMoney) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney - moneySpent);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", moneySpent - inheritedMoney);
        }
        //code ends here
    }
}