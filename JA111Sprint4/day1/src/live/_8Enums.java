package live;

public class _8Enums {
    public static void main(String[] args) {
        Directions direction;
        direction=Directions.EAST;
        Directions directions1=Directions.WEST;
        System.out.println(directions1==direction);
        System.out.println(directions1==direction.SOUTH);
    }
}
enum Direction{
    EAST,WEST,NORTH,SOUTH;
}
final class Directions{
    public static final Directions EAST=new Directions();
    public static final Directions WEST=new Directions();
    public static final Directions NORTH=new Directions();
    public static final Directions SOUTH=new Directions();
}