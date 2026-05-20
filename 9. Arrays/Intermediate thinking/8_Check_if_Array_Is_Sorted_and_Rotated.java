class Solution {
    // Optimise approach
    public static boolean check(int[] nums) {     
        int n = nums.length;
        if (sorted(nums))
            return true;

        for (int i = 0; i < n; i++) {
            rotate(nums);

            if (sorted(nums))
                return true;
        }
        return false;
    }

    public static boolean sorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void rotate(int[] arr) {
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
    
    public static void main(String[] args){
        int[] nums={2,1,3,4};
        // System.out.println(rotate(arr));
        System.out.println(check(nums));
        
    }
}
