public abstract class Account {
    protected long amountSum;

    public Account(long amount) {
        this.amountSum = amount;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        boolean ret;
        if (this.pay(amount)) {
            ret = account.add(amount);
        } else ret = false;
        return ret;
    }

    long getBalance() {
        return amountSum;
    }
}
