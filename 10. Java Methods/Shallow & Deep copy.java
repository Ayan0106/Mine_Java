import java.util.*;
class Main {
    public static void main(String[] args) {
        // Shallow Copy ---- (make a referential clone)
        // Same memory address.
        int[] arr={12,15,10,47};
        int[] shallow= arr;
        shallow[0] = 50;
        System.out.println(arr[0]); // 50
        
        // Deep Copy ---- (make a independent copy of the original)
        // Different memory address.
        int[] deep=Arrays.copyOf(arr, arr.length);
        deep[0]=100;
        System.out.println(arr[0]); //50 (No change to original array)
        System.out.println(deep[0]); // 100
    }
}
