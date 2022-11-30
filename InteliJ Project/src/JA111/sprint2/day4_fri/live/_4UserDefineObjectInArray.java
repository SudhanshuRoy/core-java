package JA111.sprint2.day4_fri.live;

public class _4UserDefineObjectInArray {
    public static void main(String[] args) {
        Student [] student=new Student[2];
        Student s1=new Student("robot");
        Student s2=new Student("chunnu");
        student[0]=s1;
        student[1]=s2;
        for(int i=0;i<student.length;i++){
            System.out.println(student[i]);
        }
    }
}
