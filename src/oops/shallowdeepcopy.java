package oops;

public class shallowdeepcopy {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="meet";
        s1.rooll=30;
        s1.password="abc";
        s1.marks[0]=90;
        s1.marks[1]=85;
        s1.marks[2]=100;


        student s2= new student(s1);
        s2.password="xyz";
        s1.marks[1]=40;// deep copy ama s2 object bad s1  marks change karta s2 ma change no thay
        s1.rooll=25;
        System.out.println(s2.rooll);
        System.out.println(s2.password);
        for (int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class  student{
    int rooll;
    String name;
    String password;
    int marks[];
//    student(student s1){// shallow copy ama change thay
//        marks=new int[3];
//        this.name= s1.name;
//        this.rooll=s1.rooll;
//        this.marks=s1.marks;
////            this.password=s1.password;
//
//    }
student(student s1) {
    // deep copy ama change na thay
    marks = new int[3];
    this.name = s1.name;
    this.rooll = s1.rooll;
    for (int i=0;i< marks.length;i++){
        this.marks[i]=s1.marks[i];
    }
}
    student(){
        marks=new int[3];
        System.out.println("constructor is called>>>");
    }
//        Sstudent(String name,int rooll){
//            this.name=name;
//            this.rooll=rooll;
//        }
}
