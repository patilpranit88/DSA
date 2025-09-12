// import java.package 2D-Arrays;
import java.util.*;
public class matri {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrices[][]= new int[3][3];
        int n = matrices.length;
        int m= matrices[0].length;


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrices[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrices[i][j]+" ");
            }
            System.out.println("");
        }



    }
}


