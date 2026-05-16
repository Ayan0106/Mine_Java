// Find the sum of elements at even indices and odd indices separately.
import java.util.*;
class Main{
    public static int sum_of_elements(int[] arr){
        int sum_even=0;
        int sum_odd=0;
        if(arr==null || arr.length<2){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                sum_even+=arr[i];
            }
            else{
                sum_odd+=arr[i];
            }
        }
        System.out.println("Sum of even indices is "+sum_even);
        System.out.println("Sum of odd indices is "+sum_odd);
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
        sum_of_elements(arr);
    }
}

// 4
// 12
// 4
// 7
// 21
// 12 4 7 21 
// Sum of even indices is 19
// Sum of odd indices is 25
