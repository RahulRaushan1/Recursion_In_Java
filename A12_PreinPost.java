package A12_Recursion;

public class A12_PreinPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.println("pre "+n);
        pip(n-1);
        System.out.println("in "+n);
        pip(n-1);
        System.out.println("post "+n);

    }
    public static void main(String[] args) {
      pip(3);
    }
}
