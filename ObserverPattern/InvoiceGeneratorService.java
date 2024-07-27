package ObserverPattern;

public class InvoiceGeneratorService implements Service{
    @Override
    public void orderPlaced() {
        System.out.println("InvoiceGenerator service");
    }
    
}
