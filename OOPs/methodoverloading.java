public class methodoverloading{
    public static void main(String [] args){
      cal c = new cal();
      System.out.println(c.sum(2,5));
      System.out.println(c.sum((float)2.5,(float)5.1));
      System.out.println(c.sum(4,7,2));

    }
}

class cal{
     int sum(int a,int b){
        return a+b;
     }
     float sum(float a,float b){
        return a+b;
     }
     int sum(int a,int b,int c){
        return a+b+c;
     }
}