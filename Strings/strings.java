import java.util.*;
public class strings {

    public  static void stringchar(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+"  ");
        }
        System.out.println("");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // String str = "abcd";
        // String str1 = new String("Pranit");

        // System.out.println(str +" "+ str1);


        // String name = sc.nextLine();
        // System.out.println(name.length());

        //Concatenation
        String firstname = "Pranit";
        String lastname = "Patil";
        String fullname = firstname +" "+ lastname;
        // System.out.println(fullname);

        stringchar(fullname);


    }
}
