// Intersection of two arrays  ... Two Pointers Approach(Takes O(n+m) Time Complexity).
import java.util.*;
class Main {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] nums3=new int[Math.min(m,n)];
        // m + n and it will work. But it is unnecessary extra space. For intersection: can never exceed the smaller array length.
        int i=0, j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if (nums1[i]>nums2[j]){
                j++;
            }
            else{
                // Remove duplicates. if array is empty or previous element is different.
                if(k==0 || nums3[k-1]!=nums1[i]){
                    nums3[k]=nums1[i];
                    k++;
                }
                // nums3[k]=nums1[i];
                // k++;
                i++;
                j++;
            }
        }
        // for(k=0;k<nums3.length;k++){
        //     System.out.print(nums3[k]+" ");
        // }
        return Arrays.copyOf(nums3, k);
        
    }
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        
        
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
        
        // int[] ans = intersection(nums1, nums2);

        // for(int i = 0; i < ans.length; i++){
        //     System.out.print(ans[i] + " ");
        // }
        
    }
}
