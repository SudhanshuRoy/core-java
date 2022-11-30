package JA111.sprint2.day4_fri.problemsolving;

public class _1JavaBean {
    public static void main(String[] args) {
        Movie m1=new Movie();
        Movie m2=new Movie();

        m1.setDuration(2);
        m1.setName("Jay Ho");
        m2.setDuration(3);
        m2.setName("Rock Star");
        System.out.println(m1.getDuration());
        System.out.println(m1.getName());
        System.out.println(m2.getDuration());
        System.out.println(m2.getName());

    }
}
