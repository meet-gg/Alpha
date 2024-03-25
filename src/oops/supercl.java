package oops;

public class supercl {
    public static void main(String[] args) {
    DDogg d1=new DDogg();
        System.out.println(d1.color);
    }
}
class Animalll{
    String color;
    Animalll(){
        System.out.println("Animmal class is called");
    }
}
class DDogg extends Animalll{
    DDogg(){
        super();
        super.color="blas";
        System.out.println("Dogg constructor is called");
    }
}
class hoursse extends Animalll{
    hoursse(){
        super();
        System.out.println("houres class is callled");
    }
}