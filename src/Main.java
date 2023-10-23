public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.Put(888);
        account.GetAmount();
        account.take(225);
//        account.take(100000);
        account.GetAmount();
        System.out.println();
        DepositAccount deposit = new DepositAccount();
        deposit.Put(100000);
        deposit.take(100);
        deposit.GetAmount();
        System.out.println();
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.Put(9000);
        creditAccount.take(100);
        creditAccount.take(500);
    }
}