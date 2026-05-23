// When you see:
// sorted + rotated + O(log n)

// Immediately think:
// Binary Search on properties

class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<min){
                min=nums[mid];
            }
            
            if(nums[low]<=nums[mid]){
                min=Math.min(min, nums[low]);
                low=mid+1;
            }
            else{
                min = Math.min(min, nums[mid]);
                high=mid-1;
            }
            
        }return min;
    }
}
