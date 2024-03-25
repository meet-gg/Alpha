package oops;

public class methodoverriding {
    public static void main(String[] args) {
    duk n1=new duk();
    n1.eat();
    nnimal n2=new nnimal();
    n2.eat();
    nnimal n3=new duk();
    n3.eat();// ana mate overriding che aetle child class print thay jo nohoy tp parent class print tHAY
    }
}
class  nnimal{
    void eat(){
        System.out.println("Eat some food");
    }
}
class duk extends nnimal{
    void eat(){
        System.out.println("Eat anything");
    }
}
