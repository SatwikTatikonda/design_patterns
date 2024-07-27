package AdapterPattern;

public class YesApi {
    double retreiveBalance(String acct) {
        return 15000000;
    }

    Boolean enterAccount(String acct) {
        System.out.println("Added new acct to ICICI dataBase");
        return true;
    }

    void  excahangeMoney(String from, String to, int amount) {
        System.out.println(amount+" transferred from "+from+" to "+to);
    }
}
