// Source : netology
public class CreditAccount extends Account {
    protected long creditLimit;

    public CreditAccount(long creditLimit) {
        this.amountSum = creditLimit;
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amountSum + amount > creditLimit) {
            return false;
        } else {
            amountSum += amount;
            return true;
        }
    }

    @Override
    public boolean pay(long amount) {
        if (amountSum - amount < 0) {
            return false;
        } else {
            amountSum -= amount;
            return true;
        }
    }

}
