import java.util.Scanner;

public class P01Fishland {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double skumriaCena = Double.parseDouble(console.nextLine());
        double cacaCena = Double.parseDouble(console.nextLine());
        double palamudTeglo = Double.parseDouble(console.nextLine());
        double safridTeglo = Double.parseDouble(console.nextLine());
        int midiTeglo = Integer.parseInt(console.nextLine());

        double palamudCena = skumriaCena * 0.60 + skumriaCena;
        double safridCena = 0.80 * cacaCena + cacaCena;

        double palamud = palamudCena * palamudTeglo;
        double safrid = safridCena * safridTeglo;
        double midi = midiTeglo * 7.50;

        double pariObshto = palamud + safrid + midi;
        System.out.printf("%.2f", pariObshto);



        //code ends here
    }
}
