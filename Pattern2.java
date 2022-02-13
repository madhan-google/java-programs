import java.io.*;
import java.util.*;
class Pattern2{
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sn.nextInt();
        while(T-->0){
            int n = sn.nextInt();
            for(int i=1; i<=n; i++){
                for(int k=0; k<i; k++) System.out.print("*");
                for(int j=1; j<=(n*2)-(2*i); j++) System.out.print("#");
                for(int k=0; k<i; k++) System.out.print("*");
                System.out.println();
            }
            // System.out.println();
        }
    }
}