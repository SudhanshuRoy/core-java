package live;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class _5Hasset {
    public static void main(String[] args) {
        Set<String> hs =new HashSet();
        Set<String> lhs=new LinkedHashSet<>();
        hs.add("delhi");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Pune");
        System.out.println(hs);;
        lhs.add("delhi");
        lhs.add("Mumbai");
        lhs.add("Chennai");
        lhs.add("Pune");
        System.out.println(lhs);
    }
}
// LinkedHasSet maintain the insertion Order.
// whereas HasSet don't maintain the order.
