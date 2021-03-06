import java.util.Scanner;

public class P01HousePrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double smallRoomArea = Double.parseDouble(console.nextLine());
        double kitchenArea = Double.parseDouble(console.nextLine());
        double pricePerSquareMeter = Double.parseDouble(console.nextLine());

        double restroomArea = 0.5 * smallRoomArea;
        double mediumRoomArea = 0.1 * smallRoomArea + smallRoomArea;
        double largeRoomArea = 0.1 * mediumRoomArea + mediumRoomArea;

        double totalArea = smallRoomArea + kitchenArea + restroomArea + mediumRoomArea + largeRoomArea;
        totalArea += totalArea * 0.05;

        System.out.printf("%.2f", totalArea * pricePerSquareMeter);

        //code ends here
    }
}
