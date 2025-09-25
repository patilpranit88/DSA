public class substring{

    public static String sub(String str,int si,int ed){
     String sunstr = "";
     for(int i=si; i<ed; i++){
        sunstr += str.charAt(i);
     }
     return sunstr;
    }
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(sub(str, 0, 5));
        // System.out.println(str.substring(0, 5 ));
    }
}