import static java.lang.Math.abs;

public class CreditAccount extends Account {
    protected long creditLimit;

    public CreditAccount(long amount, long creditLimit) {
        super(0);
        this.creditLimit = -abs(creditLimit);
    }

    @Override
    public boolean add(long amount) {
        boolean ret;
        if (amountSum + abs(amount) <= 0) {
            amountSum += abs(amount);
            ret = true;
        } else ret = false;
        return ret;
    }

    @Override
    public boolean pay(long amount) {
        boolean ret;
        if (amountSum - abs(amount) >= creditLimit) {
            amountSum -= abs(amount);
            ret = true;
        } else ret = false;
        return ret;
    }
}
