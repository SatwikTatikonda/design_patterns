package AdapterPattern;

public class PhonePay {
    
    BankApi bankApi;

    PhonePay(BankApi bankApi) {
        this.bankApi = bankApi;
    }
    
    double getBalance(String acct){
        return bankApi.checkBalance(acct)*3;
    }

}
