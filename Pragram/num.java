import java.util.*;
//Print number from 1 to 10  using while loop
// public class num {
//     public static void main(String[] args) {
//        int num = 1;

//         while(num <= 10){
//             System.out.println(num);
//             num++;
//         }
//     }
// }


//Print number from 1 to n using while loop

// public class num {
//     public static void main(String[] args) {
//        int num = 1;
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         while(num <=range ){
//             System.out.print(num+" ");
//             num++;
//         }
//     }
// }

//Print sum of first  n natural numbers

public class num {
    public static void main(String[] args) {
       int num = 1;
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int sum=0;
        while(num <=range ){
            sum = sum + num;
            num++;
        }
        System.out.println("Sum of first "+range + " is : "+ sum);
    }
}