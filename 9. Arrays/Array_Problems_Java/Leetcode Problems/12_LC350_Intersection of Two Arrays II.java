// Example 1: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2,2]
// Example 2: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [4,9] , Explanation: [9,4] is also accepted.       (Duplicates also can occur)

// (DO IT AGAIN WHEN LEARNING HASHMAP).
import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m=nums1.length;
        int n=nums2.length;
        int i=0,j=0,k=0;
        int[] nums3=new int[Math.min(m,n)];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else{
                nums3[k]=nums1[i];
                k++;
                i++;
                j++;
            }            
        }
        return Arrays.copyOf(nums3,k);
    }
}
