package live;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,5);
        map.put(5,15);
        map.put(2,12);
        map.put(1,55);
//        System.out.println(map);
        map.forEach((k,v)-> System.out.println(k+"="+v));
        Map<Integer,Integer> treeMap=new TreeMap<>();
        treeMap.put(0,5);
        treeMap.put(5,15);
        treeMap.put(2,12);
        treeMap.put(1,55);
//        System.out.println(map);
        treeMap.forEach((k,v)-> System.out.println(k+"="+v));
    }

}
