package PrototypePattern;

public class IntelligentStudent extends Student {
    
    private int iq;

    IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent i) {
        super(i);
        this.iq = i.iq;

    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent copy() {
        
        return new IntelligentStudent(this);
    }
    
}
