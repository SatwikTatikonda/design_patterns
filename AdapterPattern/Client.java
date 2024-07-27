package AdapterPattern;

public class Client {

    public static void main(String[] args) {
        
        PhonePay phonePay1 = new PhonePay(new YesBankApiAdapter());
        System.out.println(phonePay1.getBalance("accountNumber"));
        
        // or
        
        
        PhonePay phonePay2 = new PhonePay(new ICICApiAdapter());
        System.out.println(phonePay2.getBalance("accountNumber"));


    }
    

}
