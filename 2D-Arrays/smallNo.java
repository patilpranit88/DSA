import java.util.Scanner;

public class smallNo{
    public static boolean search(int matrice[][] ){
        int small = Integer.MAX_VALUE;
            for(int i=0; i<matrice.length; i++){
                for(int j=0; j<matrice[0].length; j++){
                   small=Math.min(matrice[i][j], small);
                }
            }
             System.out.println(small);
            return false;
        }

        public static void main(String []args){
            Scanner sc = new Scanner(System.in);

            int matrice[][]= new int[3][3];
            int n=matrice.length,m=matrice[0].length;

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    matrice[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    System.out.print(matrice[i][j]+" ");
                }
                System.out.println("");
            }

            search(matrice);
        }
}