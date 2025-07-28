public class maxsubarray {
  public static void maxsubarray(int num[]) {
    int n= num.length;
    int currsum =0;
    int maxsum = Integer.MIN_VALUE;
         for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int last = j;
                currsum =0;
                for(int k=start; k<=last; k++){
                   currsum += num[k];
                  
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum = currsum;
                }
                
            }
           
        }
         System.out.println("Maximum sum :"+maxsum);
      
    }

    public static void main(String[] args) {
        int num[] = {1,-2,6,-1,3};
        maxsubarray(num);
    }
    
}
