// Find all pairs whose sum is equal to a given number...(Brute force)... Doesn't remove the duplicates..(OPTIMAL APPROACH-HASHSET)
// Array = [1, 5, 7, -1, 5]          // (Brute force)
// Target Sum = 6
// (1, 5)
// (7, -1)
// (1, 5)
import java.util.*;
class Main{
    public static int two_sum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    if(arr[i]==arr[j])
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>100){
            System.out.println("Size limited");
            return;
        }
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            if(arr[i]>Integer.MAX_VALUE || arr[i]<Integer.MIN_VALUE){
                System.out.println("Size of the item exceeds");
                return;
            }
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        two_sum(arr,6);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
