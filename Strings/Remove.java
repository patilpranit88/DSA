import java.util.*;

public class Remove {
    public static void removeElement(int[] nums, int val) {
        int k = 0; 
        System.out.print("[ ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) { 
                nums[k] = nums[i];
                k++;
                  System.out.print(nums[i]+" ");
            }

        }
        System.out.print(" ]");
        

         
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

         removeElement(arr, 2);
        
    }
}
