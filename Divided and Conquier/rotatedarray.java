public class rotatedarray {
    public static int Search(int arr[],int target,int si,int en){
        

        if(si>en){
            return -1;
        }

        int mid = si+(en-si)/2;
        //CASE 
        if(arr[mid]==target){
            return mid;
        }

        //mid on L1
        //CASE 1
        if(arr[si]<=arr[mid]){
            //CASE A left
            if(arr[si]<=target && target<=arr[mid]){
                return Search(arr, target, si, mid-1);
            }
            else{
                //CASE B right
                return Search(arr, target, mid+1, en);
            }

        }

        //CASE 2
        else{
            //CASE C right
            if(arr[mid]<=target && target<=arr[en]){
                return Search(arr, target, mid+1, en);
            }
            else{
                //CASE D left
                return Search(arr, target, si, mid-1);
            }

        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target =0;

    int ans = Search(arr, target, 0, arr.length-1);
    System.out.println(ans);

    }
}
