package live;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateOverMap {
    public static void main(String[] args) {
        Map<String,String> hm=new HashMap();
        hm.put("Bihar","Patna");
        hm.put("UP","Lucknow");
        hm.put("Delhi","New Delhi");
        hm.put("Haryana","Chandigarh");
        hm.put("Punjab","Chandigarh");
        System.out.println(hm.get("UP"));
        // 1. Iterate by keyset
        for(String key: hm.keySet()){
//            System.out.println(key+"=>"+hm.get(key));
        }
        // 2. entry set
        Set<Entry<String, String>> entryset=hm.entrySet();

        for(Entry<String, String> item:entryset){
//            System.out.println(item);
//            System.out.println(item.getKey()+"=>"+item.getValue());
        }

        //3.lembda expression
        hm.forEach((k,v)-> System.out.println(k+"=>"+v));
        // 4.using keySet and forEach
        hm.keySet().forEach(key-> System.out.println(key+"=>"+hm.get(key)));
    }

}
