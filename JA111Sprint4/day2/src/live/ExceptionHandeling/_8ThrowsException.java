package live.ExceptionHandeling;

import java.io.IOException;

public class _8ThrowsException {
    public static void main(String[] args) {
        P(45);
    }
    static void M(int age) throws IOException{
        if(age>35){
            throw new IOException("You are Not eligible for this job");
        }else{
            System.out.println("You are eligible for this job");

        }
    }
    static void N(int i) throws IOException{
        M(i);
    }
    static void P(int age) {
        try {
            N(age);
        }catch (IOException IO){
            System.out.println(IO.getMessage());
        }

    }
}
