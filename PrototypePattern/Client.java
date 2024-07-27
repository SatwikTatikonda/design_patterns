package PrototypePattern;

public class Client {

    public static void setvalues(Studentregistry studentregistry) {

        // creating student Prototype and assigning all common attrs
        Student s = new Student();
        s.setBatch("july 24");
        s.setInstructor("dheeraj");
        s.setPsp(80);

        // storig the prototype in registry
        studentregistry.register("july_24_student", s);

        // creating IntelligentStudent prototype and assigning all common attrs
        IntelligentStudent is = new IntelligentStudent();
        is.setIq(180);
        is.setBatch("july 24");
        is.setName("baba");

        // storig the prototype in registry
        studentregistry.register("inteliigentStudent_prototype", is);

    }

    public static void main(String[] args) {

        Studentregistry studentregistry = new Studentregistry();
        setvalues(studentregistry);

        // getting the student prototype and creating its copy
        Student studentCopy = studentregistry.get("july_24_student").copy();
        // setting different attrs manually
        studentCopy.setCity("eluru");
        studentCopy.setName("swapna");

        // getting the intelligent student prototype and creating its copy
        Student intelligentStudentCopy = studentregistry.get("inteliigentStudent_prototype").copy();
        // setting different attrs manually

        intelligentStudentCopy.setInstructor("srinivas");
        intelligentStudentCopy.setCity("vizag");
        intelligentStudentCopy.setPsp(95);

        System.out.println(studentCopy);
        System.out.println(intelligentStudentCopy);

    }

}
