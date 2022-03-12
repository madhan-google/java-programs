import java.io.*;
import java.util.*;
class SpaceKing {
    public static void print(String sss){
        System.out.println(sss);
    }
    public static void go(int n, int p, int q, int[] g, int[] a){
        if(n==2){
            if( ( a[0]<p && a[0]<q && a[1]<p && a[1]<q ) || ( a[0]<q && a[1]<q && a[0]>p && a[1]<p*2 ) ) print(Math.max(g[0], g[1])+"");
            else print("0");
        }else{
            int temp = p / q;
            if((temp&1)==0||temp==0){
                int tot = 0;
                Arrays.sort(g);
                for(int i=0; i<n; i++) tot += g[i];
                print((tot-g[0])+"");
            }else{
                int tot = 0;
                for(int i=0; i<n; i++) tot += g[i];
                print(tot+"");
            }
        }
    }
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int p = sn.nextInt();
        int q = sn.nextInt();
        int n = sn.nextInt();
        int[] alien = new int[n];
        int[] gold = new int[n];
        for(int i=0; i<n; i++){
            alien[i] = sn.nextInt();
            gold[i] = sn.nextInt();
        }
        go(n, p, q, gold, alien);
    }
}