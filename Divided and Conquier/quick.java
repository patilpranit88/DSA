public class quick {
    public static void print(int arr[]){
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println("");
 }   

 public static void quicksort(int arr[],int si,int en){
    if(si>=en){
        return;
    }

    int pin = partition(arr,si,en);
    quicksort(arr, si, pin-1);
    quicksort(arr, pin+1, en);
 }

 public static int partition(int arr[],int si ,int en){
    int pivot = arr[en];
    int i = si-1;

    for(int j=si; j<en; j++){
        if(arr[j]<= pivot){
            i++;
            //swap
            int temp = arr[j];
            arr[j] =arr[i];
            arr[i] = temp;
        }
    }
    i++;
    int temp = pivot;
    arr[en]=arr[i];
    arr[i] = temp;
    return i;
 }

 public static void main(String[] args) {
     int arr[] = {6,3,9,5,2,8};
     quicksort(arr, 0, arr.length-1);
     print(arr);
 }
}
