package AdapterPattern;

public class ICICApi {

    double getBalance(String acct) {
        return 10000000;
    }

    Boolean addNew(String acct) {
        System.out.println("Added new acct to ICICI dataBase");
        return true;
    }

    void transferMoney(String from, String to, int amount) {
        System.out.println(amount+" transferred from "+from+" to "+to);
    }
    
}
