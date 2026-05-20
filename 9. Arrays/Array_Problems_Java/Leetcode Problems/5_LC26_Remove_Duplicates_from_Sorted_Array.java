// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int index=0;
        for(int i=index+1;i<nums.length;i++){
            if(nums[i]!=nums[index]){
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
    }
}
