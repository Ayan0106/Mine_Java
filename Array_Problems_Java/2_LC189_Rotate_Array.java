class Solution {
    // Optimise approach
    public void reverse(int[] nums, int start, int end){
        while (start<end){
            nums[start]=nums[start]^nums[end];
            nums[end]=nums[start]^nums[end];
            nums[start]=nums[start]^nums[end];
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        // handle large input.when (k>n)
        k=k%n;

        reverse(nums, 0, n-1);  // First- Rotate the whole array
        
        reverse(nums, 0, k-1);  // Second- Rotate from 0 to k-1
        
        reverse(nums, k, n-1);  // Third- Rotate from k to n-1

        // Brute-Force Approach
        // -------------------------
        // for(int i=0;i<k;i++){
        //     int last=nums[n-1];

        //     // Right Shift of the other elements.
        //     for(int j=n-1;j>0;j--){
        //         nums[j]=nums[j-1];
        //     }

        //     // Move the last element to the front 
        //     nums[0]=last;

        
    }
}
