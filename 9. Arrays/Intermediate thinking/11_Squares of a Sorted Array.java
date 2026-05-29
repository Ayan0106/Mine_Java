// Squares of a Sorted Array...
import java.util.*;
class Main {
    public static int[] sortedSquares(int[] nums){
        int n=nums.length;
        int[] result=new int[n];
        int i=0, j=n-1, k=n-1;
        while(i<=j){
            int leftsquare=nums[i]*nums[i];
            int rightsquare=nums[j]*nums[j];
            if(leftsquare<=rightsquare){
                result[k]=rightsquare; // larger item goes to the last of the new array.
                j--;
            }
            else if(leftsquare>=rightsquare){
                result[k]=leftsquare;
                i++;
            }
            k--;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
