package StrategyPattern;

public class GoogleMaps {

    PathCaculator pc;
    String source;
    String destination;

    GoogleMaps(String src, String dst, String mode) {

        pc = PathFactory.GetStrategy(mode);

    }
    
    public void GetPath() {
        pc.findPath(source,destination);
    }
    
}
