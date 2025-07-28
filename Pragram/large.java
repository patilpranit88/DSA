import java.util.*;


public class large{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A :");
        int a = sc.nextInt();
        System.out.print("\nEnter the value of B :");
        int b = sc.nextInt();
        System.out.print("\nEnter the value of C :");
        int c = sc.nextInt();

        if(a>=b && a>=c){
            System.out.println("A is Large number");
        }
        if(b>=c){
            System.out.println("B is large number");
        }
        else{
            System.out.println("C is large number");
        }
    }
}