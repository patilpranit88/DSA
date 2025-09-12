
import java.util.Scanner;



public class spiral {
   
    public static void spiralprint(int matrix[][]){
        int startrow =0;
        int endrow =matrix.length-1;
        int startcol =0;
        int endcol=matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){
            for(int j=startcol; j<=endcol; j++){
                System.out.print(matrix[startrow][j]+" ");
            }

            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            for(int j=endcol-1; j>= startcol; j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            for(int i=endrow-1; i>=startrow; i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");
            }

            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }

        System.out.println();
    }


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int matrice[][]= new int[3][3];
            int n=matrice.length,m=matrice[0].length;

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrice[i][j] = sc.nextInt();
                }
            }
           spiralprint(matrice);
    }
}
