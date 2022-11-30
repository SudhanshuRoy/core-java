package assign.prob1;

import java.util.HashMap;
import java.util.Map;
public class StateAndCapital {
    public static void main(String[] args) {
        Map<String,String> hm=new HashMap();
        hm.put("Bihar","Patna");
        hm.put("UP","Lucknow");
        hm.put("Delhi","New Delhi");
        hm.put("Haryana","Chandigarh");
        hm.put("Punjab","Chandigarh");
//        System.out.println(hm);

        for(String key: hm.keySet()){
            System.out.println(key+"=>"+hm.get(key));
        }

    }
}
