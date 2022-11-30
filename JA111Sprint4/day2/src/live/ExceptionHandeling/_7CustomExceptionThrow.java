package live.ExceptionHandeling;

import java.io.IOException;

public class _7CustomExceptionThrow {
    public static void main(String[] args) {
        try {
            validate(12);
        }catch (IOException IO){
            System.out.println(IO);
        }

    }
    static void validate(int age) throws IOException{

        if(age<18) {
//            throw new ArithmeticException("Below 18 not alowed in masai");
            throw new IOException("Below 18 not allowed in masai");
        }
//
        else {
            System.out.println("Eligible for masai");
        }
        System.out.println("End of the program");
    }

}
// 1. eiter declear it so that someone else can handle this exception
// 2. handle the exception