package prob4;

import java.util.LinkedHashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> nursery=new LinkedHashMap();
         Plants plant1=new Plants("Cactus",300);
        Plants plant2=new Plants("MoneyPlant",200);
        Plants plant3=new Plants("Rose",100);
        Plants plant4=new Plants("lilly",350);

        nursery.put(plant1.getNameOfPlant(),plant1.getPriceOfPlant());
        nursery.put(plant2.getNameOfPlant(),plant2.getPriceOfPlant());
        nursery.put(plant3.getNameOfPlant(),plant3.getPriceOfPlant());
        nursery.put(plant4.getNameOfPlant(),plant4.getPriceOfPlant());

        nursery.forEach((k,v)-> System.out.println("Name: "+k+", "+"price: "+v));
    }
}
