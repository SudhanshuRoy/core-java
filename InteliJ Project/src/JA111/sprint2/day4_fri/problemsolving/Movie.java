package JA111.sprint2.day4_fri.problemsolving;

public class Movie {
   private int duration;
   private String name;
  Movie(int duration,String name){
    this.duration=duration;
    this.name=name;
}

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }

    public Movie() {
    }

}

//1. class should be public
//2. fields should be private
//3.public getter and setter for all the fields
//4. default constructur