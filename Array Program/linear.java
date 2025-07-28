public class linear {
 public static int linearSearch(int num[],int key){
    
    for(int i=0; i<num.length; i++){
        if(num[i]==key){
            return i;
        }
    }
    return -1;
 }    

 public static int canteen(String[] items, String key1) {
    for (int i = 0; i < items.length; i++) {
        if (items[i]== key1) {
            return i;
        }
    }
    return -1;
}

 public static void main(String[] args) {
    int num[] = {1,2,3,4,5,6,7,8,9};
    int key = 5;
    int index = linearSearch(num,key);
    if(index==-1){
        System.out.println("Element not found");
    }else{
        System.out.println("Element found at index "+index);
    }

    String items[] = {"Burger","Pizza","Pasta","Sandwich"};
    String key2 = "Pizza";
    int index2 = canteen(items,key2);
    if(index2==-1){
        System.out.println("Item not found");
    }else{
        System.out.println("Item found at index "+index2);
    }
  }


}
