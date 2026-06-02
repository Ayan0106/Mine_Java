class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int[] arr=new int[n];
        int count1=0, count2=0, count3=0;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                count1++;
            }
            else if(nums[i]>pivot){
                count3++;
            }
            else{
                count2++;
            }
        }
        int one=0, two=count1, three=count1+count2;
        for(int i=0;i<arr.length;i++){
            if(nums[i]<pivot){
                arr[one]=nums[i];
                one++;
            }else if (nums[i]==pivot){
                arr[two]=nums[i];
                two++;
            }else{
                arr[three]=nums[i];
                three++;
            }
        }
        return arr;
    }
}
