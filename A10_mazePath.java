package A12_Recursion;
import java.util.Scanner;
public class A10_mazePath {
        public static int maze(int row,int col,int m,int n){
            if(row==m || col==n)return 1;
//              if(row==m && col==n)return 1;
//              if(row>m || col>n)return 0;
              int rightways = maze(row,col+1,m,n);
              int downways =maze(row+1,col,m,n);
              return rightways + downways;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n :");
            int n = sc.nextInt();
            System.out.println("Enter m :");
            int m = sc.nextInt();
            System.out.println(maze(1,1,m,n));
        }

    }

