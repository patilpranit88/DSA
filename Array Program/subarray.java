public class subarray {
    public static void subarray(int num[]){
        int n= num.length;
        int ts = n*(n+1)/2;
        System.out.println("Total subarray : "+ts);
        int sum =0;
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int last = j;
                for(int k=start; k<=last; k++){
                    System.out.print("[ "+num[k]+" "+"]");
                    sum = sum + num[k];
                }
                System.out.println();
                int min = sum;
                sum =0;
                
                if(large < min){
                large = min;
            }
            if(small > min){
                small = min;
            }

            }
            System.out.println();
        }
        System.out.println("Min sum in subarray : "+small+"  Max  sum in subarray : "+large);
        
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};

        subarray(num);
    }
    
}
