import java.util.Arrays;
import java.util.Scanner;
public class Check_if_Sort {

    // finding largest and smallest value in an array after sorting.
    static int[] largest_and_smallest(int[] arr){
        Arrays.sort(arr);
        int[]ans= {arr[0],arr[arr.length-1]};       // making one temporary array to keep the smallest and largest values.
        return ans;
    }

    // checking if an array is sorted or not.
    static boolean checking_if_sorted(int[] arr){
        boolean ans=true;                          // if the array is empty...then it will be sorted.
        for(int i=1;i<arr.length;i++){             // if i=0 then 0<-1 (-1 is not here).
            if(arr[i]<arr[i-1]){
                ans= false;           // not sorted.
                break;                // if one is not sorted then no need to check further.
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[] arr= new int[n];

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Is Sorted "+checking_if_sorted(arr));  // result for the second function.
        
        int[] ans= largest_and_smallest(arr);                      // result for the first function.
        System.out.println("Smallest: "+ans[0]);
        System.out.println("Largest:"+ans[1]);
    }
}
/*5
12 23 45 74 100
Is Sorted true
Smallest: 7
Largest:65
*/
