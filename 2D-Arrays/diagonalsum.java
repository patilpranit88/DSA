import java.util.Scanner;
public class diagonalsum {
    public static int sum(int matrix[][]){
        int sum=0;
        for(int i=0; i<=matrix.length-1; i++){
            sum+=matrix[i][i];

            if(i != matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matrix[][]= new int[2][2];
            int n=matrix.length,m=matrix[0].length;

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println("The sum of diagonals is: "+sum(matrix));
    }
    
}
