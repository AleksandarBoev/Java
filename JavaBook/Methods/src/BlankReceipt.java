public class BlankReceipt {
    public static void main(String[] args) {
        printReceipt();
        //main ends here
    }

    static void receiptHeader() {
        System.out.println("CASH RECEIPT");
        System.out.println("------------------------------");
    }

    static void receiptBody() {
        System.out.println("Charged to____________________");
        System.out.println("Received by___________________");
    }

    static void receiptFooter() {
        System.out.println("------------------------------");
        System.out.println("(c) SoftUni");
    }

    static void printReceipt() {
        receiptHeader();
        receiptBody();
        receiptFooter();
    }

}
