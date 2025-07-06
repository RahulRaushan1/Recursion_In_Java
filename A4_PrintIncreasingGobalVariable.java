package A12_Recursion;
import java.util.Scanner;
public class A4_PrintIncreasingGobalVariable {
    static int n;
    public static void print(int x){
        if(x>n)return;
        System.out.println(x);
        print(x+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
         n = sc.nextInt();
        print(1);
    }
}
