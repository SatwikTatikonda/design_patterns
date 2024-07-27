package PrototypePattern;

public class Student implements Prototype<Student> {

    private String name;
    private String batch;
    private double psp;
    private String instructor;
    private String city;

    Student(){}
    
    Student(Student s){
        this.name=s.name;
        this.batch = s.batch;
        this.psp = s.psp;
        this.instructor = s.instructor;
        this.city = s.city;
    }

    public Student copy() {
        return new Student(this);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBatch(String batch) {
        this.batch = batch;
    }
    
    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }


    public String toString(){
        return (name+" "+psp+" "+instructor+" "+city+" ");
    }



    
}
