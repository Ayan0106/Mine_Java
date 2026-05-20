// Input: arr[] = [2, 4, 6, 8, 10, 12, 14, 16, 18, 20], d = 3
// Output: [8, 10, 12, 14, 16, 18, 20, 2, 4, 6]
// Explanation: when rotated by 3 elements, it becomes [8, 10, 12, 14, 16, 18, 20, 2, 4, 6].
class Solution {
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    
	static void rotateArr(int arr[], int d) {
		// code here
		int n=arr.length;
		d=d%n;
		
		reverse(arr, d, n-1);
		reverse(arr, 0, d-1);
		reverse(arr, 0, n-1);
	}
}
