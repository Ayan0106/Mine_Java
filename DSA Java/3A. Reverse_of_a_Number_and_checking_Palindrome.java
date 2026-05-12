// 141
// 141
// palindrome
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original= n;      // Because here we are making the n as 0, that's why we have to take original.
        int reverse=0;
        while(n!=0){
            reverse*=10;
            reverse+=n%10;
            n/=10;
        }
        System.out.println(reverse);
        
        if (original==reverse){
            System.out.println("palindrome");
        }
    }
}
 // Optimistic Way ...
class Solution {

    public int reverse(int x) {

        int reverse = 0;

        while(x != 0) {

            int digit = x % 10;

            // Positive overflow
            if(reverse > Integer.MAX_VALUE / 10 ||
               (reverse == Integer.MAX_VALUE / 10 && digit > 7)) {

                return 0;
            }

            // Negative overflow
            if(reverse < Integer.MIN_VALUE / 10 ||
               (reverse == Integer.MIN_VALUE / 10 && digit < -8)) {

                return 0;
            }

            reverse = reverse * 10 + digit;

            x = x / 10;
        }

        return reverse;
    }
}
