package ObserverPattern;

import java.util.*;

public class Flipkart {

    List<Service> l;
    Flipkart(){

        l = new ArrayList<>();
    }


    public void register(Service s) {
        l.add(s);
    }

    public void unregister(Service s) {
        l.remove(s);
    }

    public void showEvents(){
        for(Service s:l){
            System.out.println(s);
        }
    }

    
}
