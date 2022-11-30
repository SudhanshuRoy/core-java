package JA111.sprint3.day1.live;

public class _4Overriding {
    public static void main(String[] args) {
You you=new You();
you.earn();
    }
}
class Father{
    void earn(){
        System.out.println("earn by running a business");
    }
}
class You extends Father{
    @Override
    void earn(){
        System.out.println("Earning by software day job");
    }
}
// tules of overridding
// 1.there should be is-a-relation
// 2.method name should the same across the parent and child
//3. args list of both the methods should be the same.