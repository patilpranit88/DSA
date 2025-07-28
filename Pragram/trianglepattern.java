import java.util.*;

public class trianglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // outer loop for line
        for(int line = 1; line<=n; line++){
            //inner loop for star print
            for(int star = 1; star<=line; star++){
                System.out.print("* ");
            }
            System.err.println();
        }
    }
}
