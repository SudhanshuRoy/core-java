package JA111.sprint3.day2.arrayassign.prob2;
import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of row of matrix : ");
        int N=sc.nextInt();
        System.out.println("Enter no of column of matrix : ");
        int M=sc.nextInt();
        int matrix[][]=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.println("Enter elements of array");
                int element=sc.nextInt();
                matrix[i][j]=element;
            }
        }
        for(int i=0;i<M;i++){
            int sum=0;
            for(int j=0;j<N;j++){
                if(matrix[j][i]%2==0) {
                    sum+=matrix[j][i];
                }
            }
            System.out.println(sum);
        }
    }
}
