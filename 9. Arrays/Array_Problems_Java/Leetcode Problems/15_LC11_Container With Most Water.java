class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right){
            int area;
            if(height[left]<height[right]){
                area=height[left] * (right - left);
                left++;
            }
            else{
                area=height[right] * (right - left);
                right--;
            }
            if(area>max){
                max=area;
            }
        }
        return max;
    }
}
