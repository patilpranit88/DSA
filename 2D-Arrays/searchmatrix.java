import java.util.Scanner;

public class searchmatrix {
    public static boolean search(int matrix[][],int key){
        int row =0;
        int col = matrix[0].length-1;

        while(row<matrix.length && col >= 0){
            if(matrix[row][col]==key){
                System.out.println("Found key  at ("+ row +"," + col + ")");
                return true;
            }
             else if(key < matrix[row][col]){
                col --;
             }
             else{
                row ++;
             }
             System.out.println("Not Founnd at");
             return false;

       }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = 33;

        int matrix[][]= new int[2][2];
            int n=matrix.length,m=matrix[0].length;
 
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }
            search(matrix,key);
        }
}
