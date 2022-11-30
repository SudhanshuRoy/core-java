// this keyword without paranthesis is object of current class
// but thsi keyword along with paranthesis is refer constructor call.

package JA111.sprint2.day3.practice;

public class _2CallingAConstructorUsingThis {

    _2CallingAConstructorUsingThis(){
        this(10);
        System.out.println("default construcor");

    }
    _2CallingAConstructorUsingThis(int x){
        System.out.println("parameterised constructor");

    }


    public static void main(String[] args) {
        _2CallingAConstructorUsingThis object=new _2CallingAConstructorUsingThis();
    }
}

//Remark: this always be the first statement in a constructor
// this always refer to current object.