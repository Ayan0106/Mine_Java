// IN ARRAY WE can not update the capacity/ length of the array,
//     WE can update the contents inside the array.....Here, we are replacing the element in one pointer..

class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}
