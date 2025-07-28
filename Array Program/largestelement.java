public class largestelement {
    public static int largestElement(int num[]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;

        for(int i=0;i<num.length; i++){
            if(large < num[i]){
                large = num[i];
            }
            if(small > num[i]){
                small = num[i];
            }

        }
        System.out.println("Small Element is : "+small);
        return large;
    }

    public static void main(String[] args) {
        int num[] ={1,2,6,-2,5};
        System.out.println("Largest element is :"+largestElement(num));
    }
    
}
