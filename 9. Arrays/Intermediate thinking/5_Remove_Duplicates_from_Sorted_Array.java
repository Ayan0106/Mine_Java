// Remove duplicate elements in an array.
// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
import java.util.*;
class Main{
    public static int duplicateElement(int[] arr){
        int index=0;
        for(int i=index+1;i<arr.length;i++){
            if(arr[i]!=arr[index]){
                index++;
                arr[index]=arr[i];
            }
        }
        return index+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>Integer.MAX_VALUE || arr[i]<Integer.MIN_VALUE){
                return;
            }
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int k=duplicateElement(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
