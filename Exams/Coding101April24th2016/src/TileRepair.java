import java.util.Scanner;

public class TileRepair {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double landSide = Double.parseDouble(console.nextLine());
        double tileWidth = Double.parseDouble(console.nextLine());
        double tileLength = Double.parseDouble(console.nextLine());
        double benchWidth = Double.parseDouble(console.nextLine());
        double benchLength = Double.parseDouble(console.nextLine());

        double benchArea = benchLength * benchWidth;
        double tileArea = tileLength * tileWidth;
        double landArea = landSide * landSide;
        double tilesNeeded = (landArea - benchArea) / tileArea;
        double timeNeeded = tilesNeeded * 0.2;

        System.out.printf("%.2f%n", tilesNeeded);
        System.out.printf("%.2f", timeNeeded);

        //main ends here
    }
}
