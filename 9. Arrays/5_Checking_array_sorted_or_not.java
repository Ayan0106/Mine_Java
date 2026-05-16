// Check if the array is sorted in ascending order.
import java.util.*;
class Main {
    public static int checking(int[] arr){
        if(arr==null || arr.length<2){
            return -1;
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>100){
            System.out.println("Size limited");
            return;
        }
        
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if (arr[i]>Integer.MAX_VALUE || arr[i]<Integer.MIN_VALUE){
                System.out.println("Array item size exceeds");
                return;
            }
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int result=checking(arr);
        if(result==0){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Not Sorted");
        }
    }
}
