package A12_Recursion;
import java.util.Scanner;
public class A3_printDecreasing {
    public static void print(int n ){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        print(n);
    }
}
