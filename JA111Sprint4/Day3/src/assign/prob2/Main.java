package assign.prob2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Student s1=new Student(01,"sonu",45);
        Student s2=new Student(02,"monu",55);
        Student s3=new Student(03,"honu",65);
        Student s4=new Student(04,"donu",35);

        Map<Student,String> studentStringMap=new TreeMap<>();
        studentStringMap.put(s1,"Bihar");
        studentStringMap.put(s2,"UP");
        studentStringMap.put(s3,"Haryana");
        studentStringMap.put(s4,"Panjab");

        studentStringMap.forEach((k,v)-> System.out.println(k+"=>"+v));


    }
}
