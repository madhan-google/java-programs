import java.io.*;
import java.util.*;
public class KickstartA2 {
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sn.nextInt();
        for(int ii=1; ii<=T; ii++){
            long n = sn.nextLong();
            long A = 0, B = 0;
            if(n%9==0){
                System.out.println("Case #"+ii+": "+n);
            }else{
                for(int i=1; i<n; i++){
                    String s = i+""+n;
                    long temp = Long.parseLong(s);
                    // System.out.print(temp+" ");
                    if(temp%9==0){
                        A = temp;
                        break;
                    }
                }
                for(int i=1; i<=9; i++){
                    String s = n+""+i;
                    // System.out.print(s+" ");
                    long temp = Long.parseLong(s);
                    // System.out.print(temp+" ");
                    if(temp%9==0){
                        B = temp;
                        break;
                    }
                }
                System.out.println("Case #"+ii+": "+Math.min(A, B));
                // System.out.println((1e9+7));
            }
        }
    }
}
