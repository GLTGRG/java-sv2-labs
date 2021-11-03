package attributes.bill;

public class Bill {

    public static void main(String[] args) {
        BillItem book = new BillItem("Murder on the Orient Express",2500,1,27);

        System.out.println("Murder on the Orient Express " + book.calculateTotalPrice() + "Ft.");
    }
}
