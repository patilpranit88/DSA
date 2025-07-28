public class stock{
    public static int bayandsell(int prices[]){
        int buypri = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<prices.length; i++){
            if(buypri <prices[i]){
                int profit = prices[i] - buypri;
                maxprofit = Math.max(maxprofit, profit);
            }
            else{
                buypri = prices[i];
            }

        }

        return maxprofit;
    } 


    public static void main(String[] args) {
        int prices[] ={ 7,1,5,3,6,4};
        System.out.println("Max Profit : "+bayandsell(prices));
    }
}
