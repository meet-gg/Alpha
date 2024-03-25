package oops;

public class hireinheri {
    public static void main(String[] args) {
        birds b1= new birds();
        b1.eat();
        b1.fly();
        fish f1=new fish();
        f1.eat();
        f1.swim();
    }
}
class Animak{
    void eat(){
        System.out.println("Eat some food");
    }
    void color(){
        System.out.println("choose the color");
    }
}
class birds extends Animak{
    void fly(){
        System.out.println("fying birds");
    }
}
class fish extends Animak{
    void  swim(){
        System.out.println("swimming in the water");
    }
}
