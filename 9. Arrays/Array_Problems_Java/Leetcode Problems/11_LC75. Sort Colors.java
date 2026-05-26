// THREE- POINTER APPROACH--- (Dutch National Flag Problem).

// Example 1: Input: nums = [2,0,2,1,1,0], Output: [0,0,1,1,2,2]
// Example 2: Input: nums = [2,0,1], Output: [0,1,2]
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

    public void sortColors(int[] nums) {
        int low=0, mid=0, high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                // nums[low]=nums[mid];
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                // nums[high]=nums[mid];
                int temp2=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp2;
                high--;
            }
        }
    }
}
