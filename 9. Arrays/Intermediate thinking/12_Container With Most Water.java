// Container with most water.
import java.util.*;
class Main {
    public static int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int max=0;
        while(left<right){
            int area=0;
            if(height[left]<height[right]){
                area=height[left]*(right-left);
                left++;
            }
            else{
                area=height[right]*(right-left);
                right--;
            }
            if(area>max){
                max=area;
            }
        }return max;
    }
    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
