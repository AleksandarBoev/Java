import java.util.Scanner;

public class P03PhotoPictures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int pictureNumber = Integer.parseInt(console.nextLine());
        String pictureType = console.nextLine();
        String orderType = console.nextLine();

        double discount = 0;
        double picturePrice = 0;
        switch (pictureType) {
            case "9X13":
                picturePrice = 0.16;
                if (pictureNumber >= 50) {
                    discount = 0.05;
                }
                break;
            case "10X15":
                picturePrice = 0.16;
                if (pictureNumber >= 80) {
                    discount = 0.03;
                }
                break;
            case "13X18":
                picturePrice = 0.38;
                if (pictureNumber >= 50 && pictureNumber <= 100) {
                    discount = 0.03;
                } else if (pictureNumber > 100) {
                    discount = 0.05;
                }
                break;
            case "20X30":
                picturePrice = 2.90;
                if (pictureNumber >= 10 && pictureNumber <= 50) {
                    discount = 0.07;
                } else if (pictureNumber > 50) {
                    discount = 0.09;
                }
                break;
        }
        double totalPrice = pictureNumber * picturePrice - (pictureNumber * picturePrice * discount);
        if (orderType.equals("online")) {
            totalPrice -= totalPrice * 0.02;
        }
        System.out.printf("%.2fBGN", totalPrice);

        //main ends here
    }
}