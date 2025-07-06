package A12_Recursion;
import java.util.Scanner;
public class A6_SumReturntype {
        public static int sum(int n){
            if(n==1 || n==0) return n;
            return  n * sum(n-1);
        }
        public static void main(String[] args) {
            System.out.println("Enter a Number:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(sum(n));
        }
    }

