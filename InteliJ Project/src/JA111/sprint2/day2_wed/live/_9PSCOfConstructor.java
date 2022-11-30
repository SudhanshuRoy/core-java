package JA111.sprint2.day2_wed.live;

import java.lang.management.MonitorInfo;

public class _9PSCOfConstructor {
    public static void main(String[] args) {
        Movie m1=new Movie("RRR",4,2.5);

    }
}
class Movie{
    String name;
    int noOfSong;
    double duration;
    Movie(String name,int noOfSong,double duration){

     this.name=name;
     this.noOfSong=noOfSong;
     this.duration=duration;
     System.out.println("Name: "+this.name+" No_of_song:"+this.noOfSong+" Duration:"+this.duration);
    }
    Movie(){

    }
}