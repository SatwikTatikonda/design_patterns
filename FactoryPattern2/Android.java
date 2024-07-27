package FactoryPattern2;

public class Android extends Platforms {
    
    public UIFactory createUIFactory() {
        return new AndroidUIFactory(); 
    }


}
