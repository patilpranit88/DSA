
public class binarytodecimal {
  public static void decimal(int binum){
    int n = binum;
    int pow = 0;
    int dec = 0;

    while(binum>0){
        int lastdigit = binum%10;
        dec = dec+(lastdigit*(int)Math.pow(2, pow));
        pow++; 
        binum = binum/10;
    }
    System.out.println("Decila of "+n+" : "+dec);
  }    

  public static void main(String[] args) {
      decimal(101);
  }
}
