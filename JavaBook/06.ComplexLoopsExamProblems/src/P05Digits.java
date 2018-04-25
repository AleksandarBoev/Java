import java.util.Scanner;

public class P05Digits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine()); // naprimer 123 => purva cifra e "3", vtora e "2", treta e "1" (bi trqbvalo da e obratnoto no v zadachata e taka)
        int temporary = n;
        int n3 = temporary % 10;
        temporary /= 10;
        int n2 = temporary % 10;
        temporary /= 10;
        int n1 = temporary % 10; //chisloto, koeto e bilo s cifri n3-n2-n1 veche e razbito

        int numberOfRows = n1 + n2;
        int numberOfCols = n1 + n3;

        for (int row = 0; row < numberOfRows; row++) {
            for (int col = 0; col < numberOfCols; col++) {
                if (n % 5 == 0) {
                    n -= n1;
                } else if (n % 3 == 0) {
                    n -= n2;
                } else {
                    n += n3;
                }
                System.out.print(n  + " ");
            }
            System.out.println();
        }


        //main ends here
    }
}
