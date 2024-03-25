package oops;

public class constuctor {
    public static void main(String[] args) {
        SStudent s1=new SStudent("meet",40);
        SStudent s2=new SStudent("yash");
        System.out.println(s1.name);
        System.out.println(s1.rooll);
//        System.out.println(s2.name);
    }
}
class  SStudent{
    int rooll;
    String name;
    SStudent(String name,int rooll){
        this.name=name;
        this.rooll=rooll;
    }
    SStudent(String name){
        this.name=name;
    }
}
