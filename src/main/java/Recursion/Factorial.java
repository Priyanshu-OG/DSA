package Recursion;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number to find the factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
