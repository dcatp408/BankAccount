public class TestBank {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        System.out.println(BankAccount.getAccountsCreated());
        System.out.println(BankAccount.getAccountsTotal());
    }
}