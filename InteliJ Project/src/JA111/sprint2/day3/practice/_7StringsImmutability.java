/*Strings once created in string pool area will neither be remover nor be created again
* i.e, if you assign same content to different variables all variables will point to same content it will not be
* created again. all the variables have same address and content as well.
* if reassign it will start pointing to different content of sting but last content is also in string pool.
* All these rules are valid for string literals not for string created by new operator.
* when string is created by new operator if you assign same content 100 diff variables it will be created by
* 100 times and all will have diff reference but same content that's why use equals to method to compare.
* */

package JA111.sprint2.day3.practice;

public class _7StringsImmutability {
    public static void main(String[] args) {

    }
}
