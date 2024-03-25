package oops;

public class copyconstuctor {
        public static void main(String[] args) {
            Sstudent s1=new Sstudent();
           s1.name="meet";
           s1.rooll=30;
           s1.password="abc";
           s1.marks[0]=90;
           s1.marks[1]=85;
           s1.marks[2]=100;
           Sstudent s2= new Sstudent(s1);
           s2.password="xyz";
           s1.marks[1]=40;//aya  marks pela copy thaya bad tema change karta output ma change thay che aavu khali array maj thay che string ma thatu nathi
            s1.rooll=25;//aya change karvathji roll ma na thay aavu khali array ane sub class  ma thay
            System.out.println(s2.rooll);
            System.out.println(s2.name);
            System.out.println(s2.password);
            for (int i=0;i<3;i++){
                System.out.println(s2.marks[i]);
            }
        }
    }
    class  Sstudent{
        int rooll;
        String name;
        String password;
        int marks[];
        Sstudent(Sstudent s1){// shallow copy change thay
            marks=new int[3];
            this.name= s1.name;
            this.rooll=s1.rooll;
            this.marks=s1.marks;
            this.password=s1.password;
        }
        Sstudent(){
          marks=new int[3];
            System.out.println("constructor is called>>>");
        }
//        Sstudent(String name,int rooll){
//            this.name=name;
//            this.rooll=rooll;
//        }
    }
