import java.util.Scanner;

public class Battles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int player1Pokemons = Integer.parseInt(console.nextLine());
        int player2Pokemons = Integer.parseInt(console.nextLine());
        int maxNumberOfBattles = Integer.parseInt(console.nextLine());
        int numberOfBattles = 0;

        for (int i = 1; i <= player1Pokemons; i++) {
            for (int j = 1; j <= player2Pokemons; j++) {
                numberOfBattles += 1;
                if (numberOfBattles > maxNumberOfBattles) {
                    break;
                }
                System.out.printf("(%d <-> %d) ", i, j);
            }
//            System.out.println("");
        }
        //code ends here
    }
}
