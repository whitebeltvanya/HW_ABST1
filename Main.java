public class Main {
    public static void main(String[] args) {
        Account accSimple = new SimpleAccount(400);
        accSimple.add(200);
        accSimple.pay(100);
        System.out.println("accSimple: " + accSimple.getBalance());

        Account accCredit = new CreditAccount(100, 1000);
        accCredit.pay(200);
        accCredit.add(200);
        accCredit.pay(500);
        accCredit.add(400);
        System.out.println("accCredit: " + accCredit.getBalance());

        accSimple.transfer(accCredit, 100);
        System.out.println("accSimple: " + accSimple.getBalance());
        System.out.println("accCredit: " + accCredit.getBalance());
    }
}
