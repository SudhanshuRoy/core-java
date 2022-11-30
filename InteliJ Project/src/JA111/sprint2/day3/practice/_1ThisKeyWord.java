// As you know static is related to class not to object
// whereas constructor is related to object creating object that's why you can't make constructor static.
// lly this keyword is also related to object and refer to object of current class. that's why you can't use this
// in static area.

package JA111.sprint2.day3.practice;

public class _1ThisKeyWord {
    int x=10;
    void fun(){
        int x=1000;
        System.out.println(this);
        System.out.println(this.x);
        System.out.println(x);
    }
    public static void main(String[] args) {
        int x=100;
        _1ThisKeyWord object=new _1ThisKeyWord();
        System.out.println(object);
        object.fun();
        System.out.println(object.x);
        System.out.println(x);
    }
}
