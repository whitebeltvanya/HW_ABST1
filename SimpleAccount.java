import static java.lang.Math.abs;

public class SimpleAccount extends Account {

    public SimpleAccount(long amount) {
        super(amount);
    }

    @Override
    public boolean add(long amount) {
        amountSum += abs(amount);
        return true;
    }

    @Override
    public boolean pay(long amount) {
        boolean ret;
        if (amountSum - abs(amount) < 0)
            ret = false;
        else {
            amountSum -= abs(amount);
            ret = true;
        }
        return ret;
    }

}
