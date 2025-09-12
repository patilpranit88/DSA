    import java.util.*;

    public class matrice{
     
        public static boolean search(int matrice[][] , int key){
            for(int i=0; i<matrice.length; i++){
                for(int j=0; j<matrice[0].length; j++){
                    if(matrice[i][j]==key){
                        System.out.println("Found at cell ("+ i+","+j+")");
                        return true;
                    }
                }
            }

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

            search(matrice, 5);
        }
    }