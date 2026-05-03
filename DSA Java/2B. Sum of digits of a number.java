// input : 56142
// output: 5+6+1+4+2=18
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        System.out.println(sum);
    }
}
