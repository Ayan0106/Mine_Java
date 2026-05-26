// THREE- POINTER APPROACH--- Dutch National Flag Problem.
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
