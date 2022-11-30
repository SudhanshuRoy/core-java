package pre;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class _1HasMapDemo<set2> {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm=new HashMap<>();
        String str="abcd";
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),i);
        }
        hm.put('a',10);
        System.out.println(hm.size());
        System.out.println(hm);
        Set<Character> set=hm.keySet();
        System.out.println(set);
        Collection<Integer> collection=hm.values();
        for(Integer i:collection){
            System.out.println(i);
        }

        Set<Map.Entry<Character,Integer>> set2=hm.entrySet();
//        System.out.println(set2);
        for(Map.Entry<Character,Integer> me:set2){
            System.out.println(me.getKey()+"----------"+me.getValue());
        }
    }

}
