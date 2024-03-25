package oops;

public class basic {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "yellow";
        System.out.println(p1.color);
        p1.setColor("white");
        System.out.println(p1.color);
        p1.setTip(52);
        System.out.println(p1.tip);
        p1.tip=20;
        System.out.println(p1.tip);

    }
    }
    class Pen{
        String color;
        int tip;
        void setColor(String newcolor){
            color=newcolor;
        }
        void setTip(int newtip){
            tip=newtip;
        }
    }
