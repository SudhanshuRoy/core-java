package JA111.sprint2.day2_wed.live;

public class _2ObjectCollaboration {
    public static void main(String[] args) {
Office office=new Office();
office.companyName="Masai";
office.address=new Address();
office.address.city="Banglore";
office.address.zip="844112";
        System.out.println("company:"+office.companyName+" city:"+office.address.city+" zip:"+office.address.zip);
    }
}
class Office{
    String companyName;
    Address address;
}
class Address{
String city;
String zip;
}