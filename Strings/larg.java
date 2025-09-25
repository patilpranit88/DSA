public class  larg{
    public static void main(String[] args) {
        String fruits[] = { "Apple" , "Banana" ,"Mango"};
        String large = fruits[0];

        for(int i=1; i<fruits.length; i++){
            if(large.compareTo(fruits[i]) < 0){
                large = fruits[i];
            }
        }

        // System.out.println(large);

        StringBuilder st = new StringBuilder("");

        for(char ch='a'; ch<='z'; ch++){
            st.append(ch);
        }

        System.out.println(st);
    }
}
