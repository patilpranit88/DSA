public class methodoverloadingdatatype {
    

  public static float sum(float a,float b){
    return a+b;
  }    


  public static int sum(int a,int b){
    return a+b;
  }
  public static void main(String[] args) {
    System.out.println("Sum is : "+sum(5,10));
    System.out.println("Sum is : "+sum(5.2f,3.4f));
  }
}


