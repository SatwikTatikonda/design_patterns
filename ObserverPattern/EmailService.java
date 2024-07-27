package ObserverPattern;

public class EmailService implements Service{

    @Override
    public void orderPlaced() {
        System.out.println("Email service");
    }
    
}
