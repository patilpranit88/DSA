public class subset {
    public static void subsetarr(String str , String ans, int i){

        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }

        subsetarr(str, ans+str.charAt(i), i+1);
        subsetarr(str, ans, i+1);

    }


    public static void main(String[] args) {
        String str = "abc";
        subsetarr(str, "", 0);
    }
}

