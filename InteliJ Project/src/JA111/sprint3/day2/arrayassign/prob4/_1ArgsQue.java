package JA111.sprint3.day2.arrayassign.prob4;
public class _1ArgsQue {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++) System.out.println((args[i]));
        if(args.length>2){
            System.out.println("Error!");
        }else if(args.length==1){
            String s=args[0];
            int num= Integer.parseInt(s);
            System.out.println(factorial(num));
        }else if(args.length==2){
            String s1=args[0];
            String s2=args[1];
            int num1=Integer.parseInt(s1);
            int num2=Integer.parseInt(s2);
            int n=Math.abs(num1-num2);
            System.out.println(factorial(n));
        }
    }
  static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        return fact;
    }
}
