import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.attribute.standard.Sides;

public class LinearMaze {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }
    public static List<Integer> getPrimes(int n){
        List<Integer> res = new ArrayList<>();
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                res.add(i);
            }
        }
        return res;
    }
    public static final Scanner sn = new Scanner(System.in);
    public static boolean backtrack(int[] ar, int index, int n, List<Integer> primes){
        if(index>n) return false;
        if(index==n-1) return true;
        for(int i=index; i<n; i++) 
            if(primes.contains(i)&&ar[i]%i==0) 
                if(backtrack(ar, i+i, n, primes)) return true;
        return false;
    }
    public static void main(String[] args) {
        int T = sn.nextInt();
        while(T-->0){
            int n = sn.nextInt();
            int[] ar = new int[n];
            for(int i=0; i<n; i++)
                ar[i] = sn.nextInt();
            int limit = sn.nextInt();
            List<Integer> primes = getPrimes(limit);
            // System.out.println(primes);
            int sInd = 0;
            for(int x : primes){
                if(ar[0]%x==0){
                    sInd = x;
                    break;
                }
            }
            // System.out.println(sInd);
            System.out.println((backtrack(ar, limit==1?0:sInd, n, primes)?"YES":"NO"));
        }
    }    
    
}
