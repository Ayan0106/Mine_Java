import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any size :");
        int n=sc.nextInt();
        int[] arr=new int[n];

        System.out.println("Enter elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// Enter any size :
// 5
// Enter elements :
// 12 13 15 45 14
// 12 13 15 45 14
