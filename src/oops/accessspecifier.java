package oops;

public class accessspecifier {
    public static void main(String[] args) {
        cen p1 = new cen();
        p1.color = "yellow";
        System.out.println(p1.color);
        p1.setColor("white");
        System.out.println(p1.color);
        p1.setTip(52);
        System.out.println(p1.tip);
        p1.tip=20;
        System.out.println(p1.tip);
//        p1.password="meet";
//        this is not possible because of password is private only access into the class
        p1.setPassword("yaast");
//        System.out.println(p1.password);
//         we are not print the password only change using the function
    }
}
class cen{
    private String password;
    void setPassword(String newpassword){
        password=newpassword;
    }

    protected String color;
    int tip;
    void setColor(String newcolor){
        color=newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
