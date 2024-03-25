package oops;

public class gettersettser {
    public static void main(String[] args) {
        PPen p1 = new PPen();
        p1.setColor("yellow");
        System.out.println(p1.getcolor());
        p1.setColor("white");
        System.out.println(p1.getcolor());
        p1.setTip(52);
        System.out.println(p1.gettip());
        p1.setTip(20);
        System.out.println(p1.gettip());
        // setter and getter are used for print and chane value for PRIVATE
    }
}
class PPen{
    private  String color;
   private  int tip;
   String getcolor(){
       return this.color;
   }
   int gettip(){
       return  this.tip;
   }
    void setColor(String newcolor){
        color=newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
