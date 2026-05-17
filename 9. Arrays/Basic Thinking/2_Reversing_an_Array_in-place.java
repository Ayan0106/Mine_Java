// Reversing_an_Array_in-place.
import java.util.*;
class Main{
    public static int reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            arr[start]=arr[start]^arr[end];
            arr[end]=arr[start]^arr[end];
            arr[start]=arr[start]^arr[end];
            start++;
            end--;
        }
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[3];
        
        arr=new int[]{2,45,14};
        
        System.out.println(arr[0]);
        reverse(arr);
        System.out.println();      // for the next line
        System.out.println(arr[0]);
        
        
        
    }
}
