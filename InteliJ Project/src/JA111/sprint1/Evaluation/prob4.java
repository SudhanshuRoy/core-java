package JA111.sprint1.Evaluation;

public class prob4 {
    public static void main(String s[]){
        int i=1;
       int count=1;
        do{
            i++;
            if(i%2==0){
                System.out.println(i);
                count++;
            }else{
                continue;
            }

        }
        while(count<=10);
    }
}
