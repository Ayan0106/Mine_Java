// (OPTIMISE APPROACH)   (BRUTE FORCE approach is in "Intermediate thinking folder")
class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int count=0;
        if (nums==null){
            return false;
        }
        for(int i=0;i<=n-1;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }                    
            if (count>1){
                return false;
            }
        }
        return true;
    }
}

