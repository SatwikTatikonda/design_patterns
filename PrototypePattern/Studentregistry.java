package PrototypePattern;

import java.util.*;

// after creating the Prototype we store it in registry-------
public class Studentregistry {

    Map<String,Student>map=new HashMap<>();

    public Student get(String k) {
        return map.get(k);
    }

    public void register(String key, Student value) {
        map.put(key, value);
    }

    
}
