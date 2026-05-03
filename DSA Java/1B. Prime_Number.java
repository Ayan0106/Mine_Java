import java.util.*;
public class Prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==0|| n==1){
            System.out.println("Not Prime nor Non-prime");
            return;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){  
            //Math.sqrt(n) for better approach.. cause after Math.sqrt(n) same no of factors in both side
            // 60= 1,2,3,4,5,6 ... Math.sqrt(60)=7 ... 10,12,15,20,30,60
                if (n%i==0){
                    System.out.println("Composite number");
                    return;
                }
            }
        }
        System.out.println("Prime Number");
    }
}
