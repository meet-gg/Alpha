package Hashmap;

import java.util.HashMap;

// abc cab  True
// ancd  acde  False
// earth heart True
public class anagram {
    public static void main(String[] args) {
        String s="earthh";
        String t="hearthu";
        if (s.length()!=t.length()){
            System.out.println(false);
            return;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int j=0;j<t.length();j++){
            if (map.get(t.charAt(j))!=null){
                if (map.get(t.charAt(j))==1){
                    map.remove(t.charAt(j));
                }
                else{
                    map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
                }
            }
            else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(map.isEmpty());

    }
}
