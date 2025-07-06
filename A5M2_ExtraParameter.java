package A12_Recursion;
import java.util.Scanner;
public class A5M2_ExtraParameter {
    public static void print(int x,int n){
        if(x>n)return;
        System.out.println(x); // work
        print(x+1,n); // call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        print(1,n);


    }
}
