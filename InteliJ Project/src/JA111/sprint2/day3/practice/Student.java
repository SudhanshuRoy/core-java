package JA111.sprint2.day3.practice;

public class Student {

   private String name;
   private String student_code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudent_code() {
        return student_code;
    }

    public void setStudent_code(String student_code) {
        this.student_code = student_code;
    }

    public Student(String name, String student_code) {
        this.name = name;
        this.student_code = student_code;
    }

    public Student() {
    }
}

//Java bean class should be public, all the properties should be private and havng getter and setter to access&set all the properties
// one default constructor should be there as well of you can create  setter as constructor to set all the value at a time
// purly reusable encapsulated java class.
// getter and setter to protect from outside noone can access directly.