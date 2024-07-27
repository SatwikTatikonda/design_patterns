package FactoryPattern;

public class Factory {

    //    nonfactory methods
    public void setTheme() {
        System.out.println("settign theme");
    }
    
    public void setRefreshRate() {
        System.out.println("setting refersh ");
    }

    // Factory methods

    public UIFactory createUIFactory(SupportedPlatforms platform) {

        // if (platform.equals("ANDROID")) {
        //     return new AndroidUIFactory();
        // }
        // else if (platform.equals("IOS")) {
        //     return new IOSUIFactory();
        // }
        // else {
        //     return null;
        // }

        return UIFactoryFactory.createUIFactoryForPlaforms(platform);

    }
}
