// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 ... 0s are just placeholder empty spaces in nums1.
// Output: [1,2,2,3,5,6]
// (Backward Traversing Because we have to store the sorted items in one existing Array w/o using any new Array).
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while (i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                i--;
            }else{
                nums1[k]=nums2[j];
                j--;
            }
            k--;
        }
        while(j>=0){        // We areputting all the elements in nums1 , so the remaining element of nums2 are always taken.
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }
}
