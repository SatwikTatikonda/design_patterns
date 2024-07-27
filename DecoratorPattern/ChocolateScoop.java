package DecoratorPattern;

public class ChocolateScoop implements IceCream{

    IceCream iceCream;

    ChocolateScoop(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }

    @Override
    public String getDescription() {
       return iceCream.getDescription()+" Chocolate scoop ";
    }
    
}
