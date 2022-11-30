package JA111.sprint2.day2_wed.live;

public class _7UserDefineObjectAsParameter {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.age=24;
        System.out.println(myMethod(employee));
        System.out.println(createObject(employee));

    }
    static int myMethod(Employee employee){
        return employee.age;

    }
    static Employee createObject(Employee employee){
        return new Employee();
    }
}
class Employee{
    int age;
}