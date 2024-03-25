package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        TreeMap<String,Integer> hm=new TreeMap<>();
//        hm.containsKey()
        hm.put("meet",10);
        hm.put("jeet",20);
        hm.put("yash",30);
        hm.put("meet",100);
        System.out.println(hm.get("yash"));
        System.out.println(hm);
        System.out.println("-------------------------");
//        Set<String> KeySet=hm.keySet();
        for (String k : hm.keySet()){
            System.out.println("keys="+k+ " "+"value="+hm.get(k));
        }
            // 15 thi 18 line sudhi key ane value print karava mate che teni BIJI METHOD ENTRY SEt
        System.out.println("----------------------");
        System.out.println("second method for print map");
        for (Map.Entry me : hm.entrySet()){
            System.out.println(me.getKey() +" " +me.getValue());
        }
        System.out.println("-----------------------");
    }
}
