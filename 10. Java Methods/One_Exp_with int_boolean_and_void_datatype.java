// 121
// Palindrome
import java.util.Scanner;
class Main{
    public static boolean Check_Palindrome(int n){
        int reverse=0;
        int original=n;
        while(n!=0){
            reverse*=10;
            reverse+=n%10;
            n/=10;
        }
        if (original==reverse){
            return true;       // If The return statement is "Int" then return 1/0;
        }                      // If the return statement is "Void" then Sout "";
        else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
                                          // If The return statement is "Int" then use variable "Result=Check_Palindrome(n)";
        if (Check_Palindrome(n)){         // If the return statement is "Void" then just Call the Function "Check_Palindrome(n)".
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
