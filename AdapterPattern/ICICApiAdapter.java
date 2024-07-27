package AdapterPattern;

// These are adapter classes wch are implementing common methods of BankApi------------

public class ICICApiAdapter implements BankApi {

    ICICApi icicAPi=new ICICApi();
    public double checkBalance(String acct) {
        return icicAPi.getBalance(acct);
    }

    public void sendMoney(String from, String to, int amount) {
        icicAPi.transferMoney(from, to, amount);
    }
    
    public boolean addAccount(String acct) {
        return icicAPi.addNew(acct);
    }
    
}
