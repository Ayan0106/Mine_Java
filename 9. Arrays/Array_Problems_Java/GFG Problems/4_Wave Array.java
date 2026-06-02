// Input: arr[] = [2, 4, 7, 8, 9, 10]
// Output: [4, 2, 8, 7, 10, 9]

class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int n=arr.length;
        for (int i = 0; i < n - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}
