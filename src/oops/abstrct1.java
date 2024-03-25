package oops;

public class abstrct1 {
    public static void main(String[] args) {
//        mustang m=new mustang();
        hourses h=new hourses();
        h.walk();
        Doog d=new Doog();
        d.walk();
        System.out.println(h.color);
        System.out.println(d.color);
    }
}
abstract class nimal{
    String  color;
    nimal(){
        color="brown";
//        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("eat some food");
    }
    abstract void walk();
}
class Doog extends nimal{
   Doog(){
      color="black";
//       System.out.println("Dog constructor called");
        }
    void walk() {
        System.out.println("two leg");
    }
}
class hourses extends nimal{
//    hourses(){
//        System.out.println("Hourse constructor called");
//    }
    void walk() {
        System.out.println("four leg");
    }
}
//class mustang extends hourses{
//    mustang(){
//        System.out.println("mustang constructors called");
//    }
//}