
/*3. Explain has-A relationship with a code example.

Ans: Has-A relationship is relation between two separate classes in which one class contain one class has
object of other class. It is mainly used for reusability of code.

Kindly go though the below code and example for more understanding.
In office class have reference of address class.

 */

package JA111.sprint2.Evaluation;

public class _3Prob3 {
    public static void main(String[] args) {
        Office office=new Office();
        office.name="Masai School";
        office.address=new Address();
        office.address.name="BLR";
        office.address.zip="6549";
        System.out.println(office.name);
        System.out.println(office.address.name);
        System.out.println(office.address.zip);
    }
}
class Office{
    String name;
    Address address=new Address();
}
class Address{
    String name;
    String zip;
}