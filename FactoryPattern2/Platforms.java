package FactoryPattern2;

public abstract class Platforms {

    //    nonfactory methods
    public void setTheme() {
        System.out.println("settign theme");
    }
    
    public void setRefreshRate() {
        System.out.println("setting refersh ");
    }

    // Factory methods


    public abstract UIFactory createUIFactory();

    
}
