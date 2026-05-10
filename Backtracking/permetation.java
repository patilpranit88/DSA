public class permetation {
    public static void findper(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            System.out.println("sub String :" +newstr);
            findper(newstr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc"; 
        findper(str, "");
    }
}
