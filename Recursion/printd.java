public class printd{
    public static void descring(int n){
        if(n == 1){
            System.out.print(n);
            return ;
        }

        System.out.print(n+ " ");
        descring(n-1);

    }
    public static void main(String[] args) {
        descring(10);
    }
}