package FactoryPattern2;
public class IOSUIFactory implements UIFactory {
    
    
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
    
}
