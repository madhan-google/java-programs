import java.io.*;
import java.util.*;
public class RobotPath{
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		int n = Int();
		int m = Int();
		int[][] dp = new int[n+1][m+1];
		for(int i=0; i<n; i++) dp[i][0] = 1;
		for(int i=0; i<m; i++) dp[0][i] = 1;
		for(int i=1; i<n; i++){
			for(int j=1; j<n; j++){
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		System.out.println(dp[n-1][m-1]);
	}
	public static void fill(int[] ar, int n){
		Arrays.fill(ar, n);
	}
	public static void clearScreen(){
		try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static int Int(){
		return sn.nextInt();
	}
	public static long getMS(){
		return System.currentTimeMillis();
	}
	public static char[] chararr(String s){
		return s.toCharArray();
	}
}
