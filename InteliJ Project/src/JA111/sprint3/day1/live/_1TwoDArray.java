package JA111.sprint3.day1.live;

public class _1TwoDArray {
    public static void main(String[] args) {
        int row=2; // row=matrix.length;
        int column=3; // col=matrix[0].length;
        int [][] matrix=new int[row][column];
        int count=0;
        for(int r=0;r<row;r++){
            for(int c=0;c<column;c++){
                 matrix[r][c]=count;
                 count++;
            }
        }
        for(int r=0;r<row;r++){
            System.out.println();
            for(int c=0;c<column;c++){
                System.out.print(matrix[r][c]+" ");
            }
        }
        int [][] m={
            {0,1,2},
            {3,4},
            {5}
        };
        System.out.println();
        for(int[] ele1:m){
            System.out.println();
            for(int ele2:ele1){
                System.out.print(ele2+" ");
            }
        }


    }
}
