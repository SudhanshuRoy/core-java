package democollection;
import java.util.Set;
import java.util.HashSet;
public class _3HashSet {
    public static void main(String[] args) {
        // Set don't have any extra method they use all collection methods only
        /*
        1. duplicate not allowed
        2. on indexing in set
        3. order not preserved in HashSet but preserved in LinkedHashSet for sorting use TreeSet;
        4. There is no get,indexOf,lastIndexOf,set methods are available because there is no indexing here

        */
        // auto boxing and unauto boxing
        // auto boxing -> convert primitive into wrapper of obj
        // unauto boxing -> converting wrapper or obj to primitive
        Set<Integer> set =new HashSet<>();

//        set.add(new Integer(1)); this is actual but due to auto boxing this integer get converted into obj
        set.add(5);
        new HashSet<Integer>(4,0.80f); // you can initial capacity and load factor as well
        // it will create set of size 4 and add four whenever get filled 80 %;
      Set<Integer> set1=new HashSet<>();

    }
}
