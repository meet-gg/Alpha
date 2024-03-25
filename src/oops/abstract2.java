package oops;

public class abstract2 {
    public static void main(String[] args) {
        hourse h=new hourse();
        h.walk();
        Ddog d=new Ddog();
        d.walk();
    }
}
abstract class Animall{
    void eat(){
        System.out.println("eat some food");
    }
    abstract void walk();
}
class Ddog extends Animall{
    @Override
    void walk() {
        System.out.println("two leg");
    }
}
class hourse extends Animall{
    @Override
    void walk() {
        System.out.println("four leg");
    }
}