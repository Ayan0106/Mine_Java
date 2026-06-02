class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n=arr.length;
        int left=0;
        int right=n-1;
        while (left<right){
            if(arr[left]!=0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right--;
            }
            else{
                left++;
            }
        }
    }
}
