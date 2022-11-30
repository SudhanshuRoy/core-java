package pre;

public class VarArgs {

    static void funcA(){
        System.out.println("I am static method without any parameter");
    }
    static void funcB(String str){
        System.out.println("I am static method with parameter"+str);
    }

    static void funcC(int...i){
        int sum=0;
       for(int ele:i){
           sum+=ele;
       }
        System.out.println("sum of parameters : "+sum);
        System.out.println("I am func C method and implimeting var-args which very effectio and replaement of overloading");
    }
    public static void main(String[] args) {
        funcA();
        funcB("Charu");
        funcC(5,5,5,10);
    }
}

