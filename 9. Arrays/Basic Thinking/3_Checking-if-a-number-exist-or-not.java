// Check if a given number exists in the array.
import java.util.*;
class Main{
    public static int check_number(int[] arr, int n){
        int i;
       for(i=0;i<arr.length;i++){
           if (n== arr[i]){
               System.out.println("Index "+i);
               return 0;
           }
       }
       return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        arr=new int[]{12,4,54,7};
        // System.out.println("Enter any number :");
        // int n=sc.nextInt();
        int result=check_number(arr,12);
        if(result==0){
            System.out.println("Number found");
        }
        else{
            System.out.println("Number does not exist");
        }
    }
}
