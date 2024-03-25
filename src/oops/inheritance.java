package oops;

public class inheritance {
    public static void main(String[] args) {
    Ffish f1=new Ffish();
    f1.eat();
    f1.color();
    }
}
class Animal{
    void eat(){
        System.out.println("eat some food");
    }
    void color(){
        System.out.println("animal color ");
    }
}
class Ffish extends Animal{
    void swing(){
        System.out.println("how many swings");
    }
}
