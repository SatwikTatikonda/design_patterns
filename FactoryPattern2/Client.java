package FactoryPattern2;

public class Client {
    
    public static void main(String[] args) {
      

        // using runtime polymorphism platforms.createUIFactory returns respective UIFactory
        Platforms platforms = new Android();
        UIFactory uiFactory = platforms.createUIFactory();
        Button button=uiFactory.createButton();
        button.showButton();
    }
}