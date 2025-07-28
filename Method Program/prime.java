public class prime {
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }
        for(int i= 2; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("The number is prime or not prime : "+isPrime(11));
    }
    
}
