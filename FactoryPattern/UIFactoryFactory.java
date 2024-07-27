package FactoryPattern;

public class UIFactoryFactory {
    
    public static UIFactory createUIFactoryForPlaforms(SupportedPlatforms platform) {

        if (platform.equals(SupportedPlatforms.ANDROID)) {
            return new AndroidUIFactory();
        }
        else if (platform.equals(SupportedPlatforms.ANDROID)) {
            return new IOSUIFactory();
        }
        return null;

    }

}
