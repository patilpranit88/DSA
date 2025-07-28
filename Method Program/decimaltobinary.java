public class decimaltobinary {
    public static void binary(int denum){
        int n = denum;

        int pow =0;
        int bin = 0;
        while(denum >0){
            int rem = denum%2;
            bin = bin + (rem*(int)Math.pow(10, pow));

            pow++;
            denum = denum /2;
        }
        System.out.print("Binary of "+n+" : "+bin);
    }

    public static void main(String[] args) {
        binary(11);
    }
}
