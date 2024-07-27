package ObserverPattern;

public class Client {


    Flipkart fp = new Flipkart();
    fp.register(new EmailService());

}
