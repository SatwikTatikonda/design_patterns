package BuilderDesignPattern;

public class Client {
    
    public static void main(String[] args) {
        Student st = Student.getBuilder().setAge(10).setName("sai ram").setEmail("abc.com").setPsp(100)
                .setPhone("2538092").build();
            
                
            

            }

}
