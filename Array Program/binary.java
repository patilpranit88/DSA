public class binary {

    public static int binarySearch(int num[],int key){
        int start =0;
        int end = num.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            //Comparsion
            if(num[mid] == key){
                return mid;
            }
            if(num[mid]<key){  //Right
                start = mid+1;
            }
            else{
                end = mid-1;  //Left
            }
        }
        return -1;
    }
    
        public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14};
        int key =10;
        int ans = binarySearch(num, key);
        if(ans == -1){
            System.out.println("Element is not found");
        }
        else{
            System.out.println("Element are found at index :"+ans);
        }
        
    }
    
}
