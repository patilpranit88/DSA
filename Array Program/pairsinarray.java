public class pairsinarray {
  public static void pairPrint(int num[]){
   int tp = 0;
   int n = num.length;
   tp = (n*(n-1))/2;
   System.out.println("Total Pairs :"+tp);
    for(int i=0;i<num.length; i++){
        for(int j=i+1; j<num.length; j++){
            System.out.print("("+num[i]+","+num[j]+")");
        }
        System.out.println();
    }
      
  }    

  public static void main(String[] args) {
      int num[] = {2,4,6,8,10};

      pairPrint(num);

    
  }
}
