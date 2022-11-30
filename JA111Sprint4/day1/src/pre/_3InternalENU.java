package pre;

public class _3InternalENU {
    enum Direction{
        EAST,WEST,SOUTH,NORTH;
    }

    public static void main(String[] args) {
        Direction d=Direction.EAST;
        System.out.println(d);
        
        // If it of type string you can assign worng direction as well but if it enum then you have
        // only some limited options and you have to take out of them only.
    }
}

//enum is like data types but you can only some fixed set of value or variable
