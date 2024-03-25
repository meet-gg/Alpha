package Hashmap;

import java.util.HashMap;

public class iternary_from_tickets {
    public static String start(HashMap<String,String> map) {
        HashMap<String,String> remap=new HashMap<>();

        for (String key:map.keySet()){
            remap.put(map.get(key),key);
        }
        for (String key:map.keySet()){
            if (!remap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<>();
        map.put("chennai","Bengluru");
        map.put("mumbai","delhi");
        map.put("goa","chennai");
        map.put("delhi","goa");

        String start=start(map);
        System.out.print(start);

        for (String key:map.keySet()){
            System.out.print("->"+map.get(start));
            start=map.get(start);
        }
        System.out.println();
    }
}
