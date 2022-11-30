package JA111.sprint1._1wed;

import com.sun.tools.jconsole.JConsoleContext;

public class You {
   static class details{

        String name,address;
        public void printDetails(){
            System.out.println("This is my first Java Application");
            for(int i=0;i<30;i++){
                System.out.print("=");
            }
            System.out.println();
            System.out.println("my Name is: " +this.name);
            System.out.println("my Address is: " +this.address);
        }
    }
    public static void main(String [] args){
        details myDetails= new details();
        myDetails.name="Sudhanshu kumar";
        myDetails.address="vill-Chhapki, P.O-Shahpur Maricha, P.S-Maniyari, District-Muzaffarpur";
        myDetails.printDetails();
    }
}
