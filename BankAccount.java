public class BankAccount {
    private double checking;
    private double saving;
    private static int accountsCreated;
    private static double accountsTotal;

    public BankAccount(){
        checking = 0;
        saving = 0;
        accountsCreated++;
    }

    public double getCheckingBalance(){
        return checking;
    }

    public double getSavingsBalance(){
        return saving;
    }
    
    public static int getAccountsCreated(){
        return accountsCreated;
    }

    public static double getAccountsTotal(){
        return accountsTotal;
    }
    
    public void depositeMoney(String account, double amount){
        if(account.equals("checking")){
            checking += amount;
        } else if(account.equals("saving")){
            saving += amount;
        }
        accountsTotal+= amount;
    }

    public void withdrawMoney(String account, double amount){
        if(account.equals("checking") && checking >= amount){
            checking -= amount;
        }
        else if(account.equals("saving") && saving >= amount){
            saving -= amount;
        }
        else {
            System.out.println("Insufficient Funds");
        }
        accountsTotal -= amount;
    }

    public void totalFunds(){
        System.out.println("Checking: " + checking + "Saving" + saving)
    }
}