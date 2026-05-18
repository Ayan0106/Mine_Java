// Remove element. ......In ARRAY element Removal, we can not change or delete an array... so we are Replacing the element.
// Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,_,_,_]
import java.util.*;
class Main{
    public static int removeElement(int[] arr, int value){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=value){
                arr[index]=arr[i];
                index++;
            }
        }
        return index;
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
        int k=removeElement(arr,2);
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(arr.length);
    }
}
