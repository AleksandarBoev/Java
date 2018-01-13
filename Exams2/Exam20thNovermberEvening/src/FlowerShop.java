import java.text.DecimalFormat;
import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int magnoliiProdadeni = Integer.parseInt(console.nextLine());
        int ziumbiuliProdadeni = Integer.parseInt(console.nextLine());
        int roziProdadeni = Integer.parseInt(console.nextLine());
        int kaktusiProdadeni = Integer.parseInt(console.nextLine());
        double podarukCena = Double.parseDouble(console.nextLine());

        double magnoliiCena = 3.25;
        double ziumbiuliCena = 4.0;
        double roziCena = 3.50;
        double kaktusiCena = 8.00;

        DecimalFormat df = new DecimalFormat("#.####");

        double specheleniPari = magnoliiCena * magnoliiProdadeni + roziCena * roziProdadeni + kaktusiCena * kaktusiProdadeni + ziumbiuliCena * ziumbiuliProdadeni;
        specheleniPari -= specheleniPari * 0.05;

        if (specheleniPari >= podarukCena) {
            System.out.printf("She is left with %s leva.", df.format(Math.floor(specheleniPari - podarukCena)));
        } else {
            System.out.printf("She will have to borrow %s leva.", df.format(Math.ceil(podarukCena - specheleniPari)));
        }

        //code ends here
    }
}
