package oops;

public class multiinheritance {
    public static void main(String[] args) {
        dog dobby=new dog();
        dobby.eat();
        dobby.leg=3;
        dobby.color();
        dobby.sleep=8;
        System.out.println(dobby.leg);
        System.out.println(dobby.sleep);
    }
}
class Aanimal{
    void eat(){
        System.out.println("Eat some food");
    }
    void color(){
        System.out.println("choose the color");
    }
}
class mummals extends Aanimal{
    int leg;
}
class dog extends mummals{
    int sleep;
}
