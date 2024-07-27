package SingletonPattern;

public class Client {

    public static void main(String[] args) throws InterruptedException {


        Thread t1=new Thread(()->{
          Dbconnection db1 = Dbconnection.getInstance();
          System.out.println(db1);
        });

        t1.start();

      Thread t2=new Thread(()->{
        Dbconnection db2 = Dbconnection.getInstance();
        System.out.println(db2);
      });

      t2.start();

      t1.join();
      t2.join();


    }
    
}
