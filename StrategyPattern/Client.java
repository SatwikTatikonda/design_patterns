package StrategyPattern;

public class Client {
    public static void main(String[] args) {
        
        GoogleMaps gm = new GoogleMaps("ELR", "BZA", "Bike");
        gm.GetPath();
    }
}
