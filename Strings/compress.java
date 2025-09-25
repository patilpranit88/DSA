public class compress {
    public static String compress(String str){
        StringBuilder sd = new StringBuilder("");
        for(int i=0; i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sd.append(str.charAt(i));
            if(count>1){
                sd.append(count.toString());
            }
        }
        return sd.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(compress(str));
    }
}
