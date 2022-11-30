// varargs means variable arguments ;

package live;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
func(1,2,3,4,5,6);
//int [] arr={1,13,4,9};

    }
    static void func(int...i){
        int sum=0;
        for(int element:i){
            sum+=element;
        }
        System.out.println(sum);
    }
}
