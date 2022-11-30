package live;

import java.io.Serializable;

public class _1MarkerInterface
{
    public static void main(String[] args) throws CloneNotSupportedException {
        MyClass obj1=new MyClass();
        MyClass obj2=(MyClass) obj1.clone();
        obj2.print();
        System.out.println(obj2.x+" "+ obj2.y);
    }
}
interface MyMarkerInterface{};
class MyClass  extends _1MarkerInterface implements Serializable,Cloneable{
    int  x=20;
    int y=10;
    void print(){
        System.out.println(x+"  "+y);
    }
    MyClass(){};

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// for clone the object
// 1.you have to implement cloneable interface
// 2.override protected object clone method
// 3. handle "CloneNotSupportedException" exception
// 4. Type caste obj.clone() to your class name.