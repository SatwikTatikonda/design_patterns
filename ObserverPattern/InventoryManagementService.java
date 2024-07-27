package ObserverPattern;

public class InventoryManagementService implements Service{
    @Override
    public void orderPlaced() {
        System.out.println("InventoryManagement service");
    }
    
}
