package DecoratorPattern;

public class BlackCurrantScoop implements IceCream{
    IceCream iceCream;

    BlackCurrantScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }

    @Override
    public String getDescription() {
       return iceCream.getDescription()+ "BlackCurrantScoop"  ;
    }
    
}
