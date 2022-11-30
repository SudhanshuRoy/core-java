package JA111.sprint3.day2.live;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter no of student : ");
        int n = sc.nextInt();
        StudentBean[] students = new StudentBean[n];
        int totalMarks = 0;
        for (int i = 0; i < students.length; i++) {

            System.out.println("Enter roll : ");
            int roll = sc.nextInt();

            sc.nextLine();
            System.out.println("Enter name : ");
            String name = sc.nextLine();

            System.out.println("Enter address : ");
            String address = sc.nextLine();

            System.out.println("Enter marks : ");
            int marks = sc.nextInt();

            StudentBean s = new StudentBean(roll, name, address, marks);
            students[i] = s;
            totalMarks+=marks;

        }
       /* for (int i=0;i<students.length;i++){

                 System.out.println("roll : "+students[i].roll+", Student Name : "+students[i].name+", student address : "+students[i].address+", marks : "+students[i].marks);
        }
        System.out.println("Average marks of students : "+totalMarks/students.length);*/
//        System.out.println(students.toString());

        // Using toString method and Inhanced for loop printed all the object of students array of type StudenBean

         for(StudentBean st:students){
             System.out.println(st);
         }
    }
}

