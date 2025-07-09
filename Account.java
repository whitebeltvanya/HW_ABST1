// Source : netology
public abstract class Account {
    protected long amountSum;

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                add(amount);
                return false;
            }
        }
        return false;
    }

    long getBalance() {
        return amountSum;
    }
}
