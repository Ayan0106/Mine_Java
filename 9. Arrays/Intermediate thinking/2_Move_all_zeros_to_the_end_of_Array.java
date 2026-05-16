// Move all zeros to the end of the array.
// 12,0,23,0,15
// 12,23,15,0,0
import java.util.*;
class Main{
    public static int move_zeros(int[] arr){
        int index=0;                 // IF THE QUESTION IS OPPOSITE TO THE MOVING TO THE FRONT...THEN JUST CHANGING THE POSITION OF THE POINTERS.
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index++;
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
        move_zeros(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
