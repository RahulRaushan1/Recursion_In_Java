package A12_Recursion;
import java.util.Scanner;
public class A18_HCF_loop {
    public static int hcf(int a,int b){ // TC = o(min(a,b))
        for(int i =Math.min(a,b);i>=1;i--){
          if(a%i==0 && b%i==0)return i;
        }
        return 1;
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        System.out.println(hcf(a,b));
    }
}
