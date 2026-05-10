

public class operation {

    public static int getbit(int n, int i){
        int bitmask = (n>>1);
        return bitmask &1;
    }
    public static int setbit(int num,int i){
        int bitmask = (1<<i);
        return num | bitmask;
    }

    public static int clearbit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updatebit(int n , int i,int newbit){
        // if(newbit == 0){
        //     return clearbit(n, i);
        // }
        // else{
        //     return setbit(n, i);
        // }

        n = clearbit(n, i);
        int bitmask = newbit<<i;
        return  n|bitmask ;
    }


    public static int clearbitinrange(int n,int i,int j){
        int a = ((~0)<<j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return  n&bitmask;
    }
    public static void main(String[] args) {
        int n= 15;
        int i=2;
        int j=4;
        System.out.println(fastExpo(3, 5));
        
    }

    public static boolean isPowaer(int n){
        return (n&(n-1))==0;
    }

    public static int countsetbit(int n){
        int count =0;
        while(n>0){
            if((n&1)!=0){
                count++;

            }
            n = n>>1;
        }
        return count;
    }
   public static int fastExpo(int a,int n){
    int ans=1;
    while(n>0){
        if((n&1)!=0){
            ans = ans * a;

        }
        a = a*a;
        n = n>>1;
    }
    return ans;
   }


    }

