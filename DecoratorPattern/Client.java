package DecoratorPattern;

public class Client {

    public static void main(String[] args) {

        IceCream iceCream = new ChocoChips(

                new BlackCurrantScoop(
                        new ChocolateScoop(
                                new VanillaCone())

                ));

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());

    }

}
