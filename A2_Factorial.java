package A12_Recursion;
import java.util.Scanner;
public class A2_Factorial {
    public static int fact(int n){
        if(n==1 || n==0) return 1;
        return  n * fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
