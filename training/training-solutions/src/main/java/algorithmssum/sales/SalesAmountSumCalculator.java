package algorithmssum.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesAmountSumCalculator {

    public int sumSalesAmount (List < Salesperson > salespeople) {
        int sum = 0;
        for (int i=0; i<salespeople.size(); i++) {
            sum += salespeople.get(i).getAmount();
        }
        return sum;
    }

    public static void main(String[] args) {

        List<Salesperson> salespeople = new ArrayList<>();
        SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();


        Salesperson salesperson = new Salesperson("Jack", 1500);
                salespeople.add(salesperson);

        System.out.println(salesAmountSumCalculator.sumSalesAmount(salespeople));
    }
}
