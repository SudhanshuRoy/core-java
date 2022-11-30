package JA111.sprint2.day4_fri.problemsolving;

public class _2ObjectAsMethodInput {
    public static void main(String[] args) {
        Movie movie=new Movie(2,"movieName");
    }
    static void objAsInput(Movie movie){
        System.out.println(movie.getName());
        System.out.println(movie.getDuration());
    }
    static Movie returnObject(){
        return new Movie(4,"name");
    }
}
