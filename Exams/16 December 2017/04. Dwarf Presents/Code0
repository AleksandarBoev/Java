import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfDwarfs = Integer.parseInt(console.nextLine());
        double santasMoney = Double.parseDouble(console.nextLine());

        double moneyNeeded = 0;
        double sandClock = 2.20;
    	double magnet = 1.50;
	    double cup = 5.00;
        double tShirt = 10.00;


        for (int dwarf = 1; dwarf <= numberOfDwarfs; dwarf++) {
            String typeOfPresent = console.nextLine();
            switch (typeOfPresent) {
                case "sand clock":
                    santasMoney -= sandClock;
                    break;
                case "magnet":
                    santasMoney -= magnet;
                    break;
                case "cup":
                    santasMoney -= cup;
                    break;
                case "t-shirt":
                    santasMoney -= tShirt;
                    break;
            }
        }

        if (santasMoney >= 0) {
            System.out.printf("Santa Claus has %.2f more leva left!", santasMoney);
        } else {
            System.out.printf("Santa Claus will need %.2f more leva.", Math.abs(santasMoney));
        }

//        main ends here
    }
}
