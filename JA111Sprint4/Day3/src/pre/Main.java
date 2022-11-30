package pre;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> hm=new HashMap<>();
        hm.put("Gurgon",new Student("Sudhanshu Kumar",01,100));
        hm.put("Mumbai",new Student("Raj Parsad",02,95));
        Set<Map.Entry<String,Student>> set=hm.entrySet();
        for(Map.Entry<String,Student> element:set){
            System.out.println(element.getKey()+"-----------"+element.getValue());
        }
    }
}
