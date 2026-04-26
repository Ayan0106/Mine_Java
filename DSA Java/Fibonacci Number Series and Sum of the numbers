// input: 3
// output: 0 1 1 2
//         4
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum=a+b;
        int c;
        System.out.print(a+" "+b+" ");
        if(n==0){
            sum=0;
        }
        for(int i=2;i<=n;i++){
            c=a+b;
            System.out.print(c+" ");
            sum+=c;
            a=b;
            b=c;
        }
        System.out.println("sum:"+sum);
        
    }
}
