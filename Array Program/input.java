
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[50];

        System.out.println("Array lenght is "+marks.length);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physic - "+marks[0]);
        System.out.println("Math - "+marks[1]);
        System.out.println("Chemistry - "+marks[2]);

        // marks[2] = marks[2]+44;
        // System.out.println("Chemistry - "+marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("Percentage  - "+percentage+"%");
    }
}
