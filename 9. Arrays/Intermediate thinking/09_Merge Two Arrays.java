import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,0,0};
        int[] arr2 = {12,100,30};
        
        // Merge algorithm works only when Both arrays are already sorted.
        // If the given array is sorted then we have to sort them first.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int n=arr1.length;
        int m=arr2.length;
        
        int[] arr3=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
            }else{
                 arr3[k]=arr2[j];
                 j++;
            }
            k++;
        }
        // When one array ends, dump all remaining elements of the other array.
        // Remaining elements of arr1
        while (i < n) {
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        // Remaining elements of arr2
        while (j < m) {
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        
        for(k=0;k<arr3.length;k++){
            System.out.print(arr3[k]+" ");
        }
    }
}
