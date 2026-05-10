public class power{
    public static int power(int a,int n){
        if(n==0){
            return 1;
        }

        int halfpower = power(a,n/2);
        int halfsq = halfpower * halfpower;

        if(n%2 != 0){
            return a*halfsq;
        }
        return halfsq;
    }

    public static void main(String args[]){
        int ans = power(2, 5);
        System.out.println(ans);
    }
}