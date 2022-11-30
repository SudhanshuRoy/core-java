package JA111.sprint2.day3.practice;

public class _3JavaBean {
    public static void main(String[] args) {
JavaBean javaBean=new JavaBean();
        System.out.println(javaBean.getx());
    }
}
class  JavaBean{
    private  int x;
    public  int getx(){
        return x;
    }
    public void setx(int a){
        x=a;
    }
    JavaBean(){};
}
class AnotherJavaBeans{
    private  int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public AnotherJavaBeans() {
    }
}