
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m=nums1.length;
        int n=nums2.length;
        int[] nums3=new int[Math.min(m,n)];

        int i=0,j=0, k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                i++;
            }else if (nums1[i]>nums2[j]){
                j++;
            }else{
              // Remove duplicates. if array is empty or previous element is different.
                if(k==0||nums3[k-1]!=nums1[i]){
                    nums3[k]=nums1[i];
                    k++;
                }
                i++;
                j++;
            }
        }
        return Arrays.copyOf(nums3, k);
    }
}
