package live;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _1set {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet();
        set.add(1);
        set.add(2);

        System.out.println(set.size());
        set.add(3);

        System.out.println(set.size());
        set.remove(2);// 2 is object not the index of set.

        System.out.println(set.isEmpty());
        for(Integer element:set){
            System.out.println(element);
        }
    }
}
