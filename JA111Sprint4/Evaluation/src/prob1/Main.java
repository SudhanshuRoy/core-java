package prob1;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Product,Integer> products=new TreeMap<>();

        for (int i=0;i<4;i++){


            System.out.println("Enter product name : ");
            String productName=sc.next();
            System.out.println("Enter price of Product : ");
            double productPrice=sc.nextDouble();
            Product product=new Product(productName,productPrice);
            products.put(product,i);
        }


        products.forEach((k,v)-> System.out.println(k+"=>"+v));

    }

}
