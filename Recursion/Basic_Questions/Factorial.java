package DSA.Recursion.Basic_Questions;
import java.util.*;


public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int ans=fact(n);
                System.out.println("The factorial of "+ n+" is "+ans);
            }
        
       public static int fact(int n) {
             if(n==0){
                return 1;
             }   
             return n*fact(n-1);
        }
}
