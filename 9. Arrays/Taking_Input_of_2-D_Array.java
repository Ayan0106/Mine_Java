import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter row:");
        int a=sc.nextInt();
        System.out.print("Enter column:");
        int b=sc.nextInt();
        int[][] arr=new int[a][b];
        
        for (int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");
            }
             System.out.println();  // for new line ... otherwise "12 15 14 17" 
        }
    }
}
