package FactoryPattern;

public class Client {
    
    public static void main(String[] args) {
        Factory flutter=new Factory();
        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.ANDROID);
        Button button = uiFactory.createButton();
        button.showButton();

        Menu menu =uiFactory.createMenu();
        menu.showMenu();

    }
}