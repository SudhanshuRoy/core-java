package JA111.sprint2.day3.Assignment;
import java.util.Scanner;
 public class Course{
    int courseId;
    String courseName;
    int courseFree;
    void displayCourseDetails(int courseId, String CourseName,int courseFree){
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseFree=courseFree;
        System.out.println("courseId: "+courseId+", courseName: "+CourseName+", courseFree: "+courseFree);
    }
    void authenticate(String username,String password){
        if(username.equals("Admin") && password.equals("1234")){

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter courseId: ");
            int courseId=sc.nextInt();

            System.out.println("Enter courseFree: ");
            int courseFree=sc.nextInt();

            System.out.println("Enter courseName: ");
            String courseName=sc.next();



            displayCourseDetails(courseId,courseName,courseFree);
        }else{
            System.out.println("Invalid Username or password");
        }
    }

     public static void main(String[] args) {
         Course course=new Course();
         course.authenticate("Admin","1234");
         course.authenticate("Sonu","12345");
     }
}



