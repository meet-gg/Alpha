package oops;

public class statickey {
    public static void main(String[] args) {
    srudent s1=new srudent();
    s1.name="yash";
    s1.schoolname="tapovan";
    srudent s2=new srudent();
        System.out.println(s2.schoolname);
        srudent s3=new srudent();
//        s3.schoolname="ashadeep";
        System.out.println(s3.schoolname);
        System.out.println(s3.name);
        srudent s4=new srudent();
        System.out.println(s4.schoolname);
    }
}
class  srudent{
    String name;
    static String schoolname;
    void setName(String name){
        this.name=name;
    }
  String getname(){
        return this.name;
    }
}
