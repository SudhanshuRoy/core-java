package JA111.sprint3.day2.live;

public class Bank {
   int getRoi(){
       return 0;
    }
}
class RBI extends Bank{
    @Override
    int getRoi(){
        return 8;
    }
}
class HDFC extends Bank{
    @Override
    int getRoi(){
        return (int)7.5;
    }
}