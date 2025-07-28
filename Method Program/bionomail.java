public class bionomail {
    public static int fact(int n){
        int f =1;
        for(int i=1;i<=n;i++){
            f = f*i;

        }
        return f;
    }

    public static int bincoeffi(int n,int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_n_r = fact(n-r);
        int fact = fact_n / (fact_r * fact_n_r); 
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial is : "+bincoeffi(5,2 ));
    }
}

