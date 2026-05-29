// Example 1: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100], 
// Explanation: After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
  
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];
        int i=0,j=n-1,k=n-1;
        while(i<=j){
            int leftsquare=nums[i]*nums[i];
            int rightsquare=nums[j]*nums[j];
            if(leftsquare<=rightsquare){
                result[k]=rightsquare;
                j--;
            }else{
                result[k]=leftsquare;
                i++;
            }
            k--;
        }
        return result;
    }
}
