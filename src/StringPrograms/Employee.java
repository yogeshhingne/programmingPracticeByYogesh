package StringPrograms;

public class Employee {
    int eno;
    String eName;
    public Employee(int eno,String eName){
        this.eno=eno;
        this.eName=eName;
    }
    public String toString(){
        return eName+" "+eno;
    }
}
