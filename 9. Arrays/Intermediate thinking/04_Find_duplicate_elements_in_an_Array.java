// Find duplicate elements in an array.
import java.util.*;
class Main{
    public static int find_duplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println(i+" is duplicate of element at "+j);
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        for(int i=0;i<n;i++){
            if (arr[i]>Integer.MAX_VALUE || arr[i]<Integer.MIN_VALUE){
                return;
            }
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        find_duplicate(arr);
    }
}
