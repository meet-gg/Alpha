package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Iteration {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("surat");
        set.add("delhi");
        set.add("bombay");
        set.add("bhavnagar");


        // Iterator for print
        System.out.println(" Iterator for print");
        Iterator it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------------");
        System.out.println("2nd enhased for loop");
        // 2nd enhased for loop
        for (String city : set){
            System.out.println(city);
        }
    }
}
