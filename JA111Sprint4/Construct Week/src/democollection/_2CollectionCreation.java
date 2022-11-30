package democollection;
import java.util.*;
public class _2CollectionCreation {
    public static void main(String[] args) {
        // In collection, you can add only obj . You can't add primitive data in collection

// collection can we created in two-way 1. type safe and 2. untyped safe.
        // type safe -> only one type of object can be added
        ArrayList<Integer> list=new ArrayList<Integer>(); // only Integer obj can be added
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//        list.add("Sonu");

        // un type safe -> any object can be added.
        ArrayList list1=new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(5);
        list1.add("Sonu");
        list1.add(true);
        list1.add('c');

        String name= (String) list1.get(3); // without type caste you can't access.
        // if some will add any random data in thousands of datas you won't be able to figure out
        System.out.println(list1);

        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        System.out.println(list1.contains('c'));

        System.out.println(list1.isEmpty());

        System.out.println(list1.indexOf('c'));
        System.out.println(list1.lastIndexOf('c'));
        //size,isEmpty,indexOf,lastIndexOf,contains,set,remove,equels,add(E),add(index,E);

        System.out.println(list1.remove(2));
        System.out.println(list1.remove("sonu")); // if i will pass obj it will remove
        // In case of set it is remove obj but here it is index so remove obj of that index
        // no indexing in set that's always remove object only.

        System.out.println(list);
        list.set(0,9);// replace the value at index o with new value
        list.add(2,10);// insert new value at 2 and shift all the element
        System.out.println(list);

        // equal method if address of two methods are equal it will return true else false
        // by default content doesn't matter for content you have to override and define.
    }

}
/*
1. You can access any element by their index any you can update any value by their index only.
2. Order of insertion is preserved. whenever you will print list , will get in same order
3. Duplicate are allow you can add same data twice.



*/