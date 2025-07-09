// Source : netology
public class SimpleAccount extends Account {

    @Override
    public boolean add(long amount) {
        amountSum += amount;
        return amountSum >= 0;
    }

    @Override
    public boolean pay(long amount) {
        if (amountSum < amount) {
            return false;
        } else {
            amountSum -= amount;
            return true;
        }
    }

}
