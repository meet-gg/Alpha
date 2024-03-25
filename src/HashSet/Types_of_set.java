package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Types_of_set {
    public static void main(String[] args) {
        // random order
        HashSet<String> set=new HashSet<>();
        set.add("surat");
        set.add("delhi");
        set.add("bombay");
        set.add("bhavnagar");
        System.out.println(set);

        // perfet order as a input
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("surat");
        lhs.add("delhi");
        lhs.add("bombay");
        lhs.add("bhavnagar");
        System.out.println(lhs);

        // sorted order wwith rispect to keys
        TreeSet<String> ths=new TreeSet<>();
        ths.add("surat");
        ths.add("delhi");
        ths.add("bombay");
        ths.add("bhavnagar");
        System.out.println(ths);
    }
}
