package AdapterPattern;

public interface BankApi {

    public double checkBalance(String acct);

    public void sendMoney(String from, String to, int amount);
    
    public boolean addAccount(String acct);
} 