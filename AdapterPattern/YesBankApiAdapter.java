package AdapterPattern;

// These are adapter classes wch are implementing common methods of BankApi------------
public class YesBankApiAdapter implements BankApi{

    YesApi yesApi=new YesApi();
    public double checkBalance(String acct) {
        return yesApi.retreiveBalance(acct);
    }

    public void sendMoney(String from, String to, int amount) {
        yesApi.excahangeMoney(from, to, amount);
    }
    
    public boolean addAccount(String acct) {
        return yesApi.enterAccount(acct);
    }
}
