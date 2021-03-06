package statements;

public class Investment {

    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        cost = 0.3;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days){
        return fund * interestRate * days / (100.0 * 365);
    }

    public double close(int days){
        double totalAmountPaid = (getFund() + getYield(days)) * (1 - cost / 100);
        double payout = active ? totalAmountPaid : 0;
        active = false;
        return payout;
    }


}

