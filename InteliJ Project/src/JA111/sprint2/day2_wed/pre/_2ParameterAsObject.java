// Method containing parameter as object

package JA111.sprint2.day2_wed.pre;



public class _2ParameterAsObject {
  void  method(Demo d){
    // access all the states and behaviour whatever you want access.
    if(d!=null){
      System.out.println("In side the method and object as parameter"+d);
      d.demo();
      d.x=100;
      System.out.println(d.x);
    }else{
      System.out.println("Kindly don't pass any null value");
    }

    }

    public static void main(String[] args) {
    Demo d=new Demo();
    _2ParameterAsObject obj=new _2ParameterAsObject();
    obj.method(d); // you can pass own class obj or any child class object as well.
    }

}
