package FactoryPattern2;

public class IOS extends Platforms {
    
    
    public UIFactory createUIFactory() {

        return new IOSUIFactory();
        
    }


}
