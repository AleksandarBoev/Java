import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int barcodeStart = Integer.parseInt(console.nextLine());
        int barcodeStop = Integer.parseInt(console.nextLine());

        int digit4Start = barcodeStart % 10;
        barcodeStart /= 10;
        int digit3Start = barcodeStart % 10;
        barcodeStart /= 10;
        int digit2Start = barcodeStart % 10;
        barcodeStart /= 10;
        int digit1Start = barcodeStart % 10;
        // 2345 -> digit4 = 5, digit3 = 4, digit2 = 3, digit1 = 2
        int digit4Stop = barcodeStop % 10;
        barcodeStop /= 10;
        int digit3Stop = barcodeStop % 10;
        barcodeStop /= 10;
        int digit2Stop = barcodeStop % 10;
        barcodeStop /= 10;
        int digit1Stop = barcodeStop % 10;
        // 6789 -> digit4 = 9, digit3 = 8, digit2 = 7, digit1 = 6
        for (int d1 = digit1Start; d1 <= digit1Stop; d1++) {
            if (d1 % 2 == 0) {
                continue;
            }
            for (int d2 = digit2Start; d2 <= digit2Stop; d2++) {
                if (d2 % 2 == 0) {
                    continue;
                }
                for (int d3 = digit3Start; d3 <= digit3Stop; d3++) {
                    if (d3 % 2 == 0) {
                        continue;
                    }
                    for (int d4 = digit4Start; d4 <= digit4Stop; d4++) {
                        if (d4 % 2 == 0) {
                            continue;
                        }
                        System.out.print("" + d1 + d2 + d3 + d4 + " ");

                    }
                }
            }
        }

//        main ends here
    }
}
