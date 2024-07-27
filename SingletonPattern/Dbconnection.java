package SingletonPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Dbconnection {

    String name;
    String pswd;
    static Dbconnection instance;
    static Lock l=new ReentrantLock();

    private Dbconnection(String name, String pswd) {
        this.name = name;
        this.pswd = pswd;
    }
    
    static Dbconnection getInstance() {
        if (instance == null){
            l.lock();
            if(instance==null){
                instance=new Dbconnection("omsairam", "jfnaeearwcs");
            }
            l.unlock();

        }
        return instance;

       
        }
    }

