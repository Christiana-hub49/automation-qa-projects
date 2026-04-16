public class PhoneBillTester {
    public static void main(String[] args) {

        PhoneBill bill1 = new PhoneBill();
        bill1.printBill();

        System.out.println();

        PhoneBill bill2 = new PhoneBill(101);
        bill2.printBill();

        System.out.println();

        PhoneBill bill3 = new PhoneBill(102, 80.0, 200, 240);
        bill3.printBill();
    }
}
