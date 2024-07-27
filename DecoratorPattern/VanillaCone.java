package DecoratorPattern;

public class VanillaCone implements IceCream {
    
    IceCream iceCream;


    VanillaCone() {
        
    }
    VanillaCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream == null){
            return 30;
        }
        return iceCream.getCost() + 30;
    }

    @Override
    public String getDescription() {
       
        if (iceCream == null) {
            return " vanilla cone ";
        }
       return iceCream.getDescription()+" vanilla cone";
    }
    
}
