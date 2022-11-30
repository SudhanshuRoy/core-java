package live;

import java.io.*;

public class SerialDemo {
    public static void main(String[] args) throws Exception {
        Save obj=new Save();
        obj.i=4;
        Save obj1=new Save();
        // we store state like values of states i=4 in file whenever we again start it will start from here only
        // we object have same amount of memory but different states i.e, values of variables
        // so to store state of obj in a file we do serilization of obj.

        File f=new File("obj.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos); // we are storing obj not date for data replace object with data.
        oos.writeObject(obj);

        // Now how to get value back
        // I will not use new keyword other it will create new object with null values
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Save obj2 =(Save) ois.readObject();
        System.out.println(obj1.i);  // created with new keyword i=0;
        System.out.println(obj2.i);  // restored from saved file i=4;

    }
}
class Save implements Serializable {
    int i;
}