import java.util.*;
public class student {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float mark = sc.nextFloat();

        String status = mark >= 33 ? "Pass" : "Fail";
        System.out.println(status);
    }
}
