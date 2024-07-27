package StrategyPattern;

public class PathFactory {

    public static PathCaculator GetStrategy(String mode) {
        if (mode.equals("Bike")) {
            return new BikePathCalculator();
        }
        else if (mode.equals("Car")) {
            return new CarPathCalculator();
        }
        else {
            return new WalkPathCalculator();
        }
    }
    
}
