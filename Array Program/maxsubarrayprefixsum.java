public class maxsubarrayprefixsum {
   
  public static void maxsubarray(int num[]) {
    int n= num.length;
    int currsum =0;
    int maxsum = Integer.MIN_VALUE;

    int prefix[] = new int[num.length];
    prefix[0] = num[0];
    for(int i=1; i<n; i++){
        prefix[i] = prefix[i-1]+num[i];
    }
         for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int last = j;
                
                currsum = start==0? prefix[last]:prefix[last]-prefix[start-1];

                if(maxsum<currsum){
                    maxsum = currsum;
                }
                
            }
           
        }
         System.out.println("Maximum sum :"+maxsum);
      
    }

    public static void kadanes(int num[]){
        int cs =0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            cs = cs+num[i];
            if(cs < 0){
                cs =0;
            }
            ms = Math.max(cs,ms);
        }

        System.out.println("Max Subarray sum is : "+ms);
    }

    public static void main(String[] args) {
        int num[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
    
}

    

