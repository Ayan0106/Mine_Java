// For Input : 3 1 1 1 2 2 3 3 3 3 3 3 4 4 4 5 5 5
// output is: 5
    
class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid]<k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
