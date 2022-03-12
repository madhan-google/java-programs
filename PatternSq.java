import java.io.*;
import java.util.*;
public class PatternSq{
	
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		int n = Int();
		int len = n+(n-1);
		int[][] ar = new int[len][len];
		int top = 0, right = len-1, bottom = len-1, left = 0, start = 0, end = len-1;
		while(n>0){
			for(int i=start; i<=end; i++){
				ar[top][i] = n;
				ar[i][right] = n;
				ar[bottom][i] = n;
				ar[i][left] = n;
			}
			start++;
			end--;
			n--;
			top++;
			right--;
			bottom--;
			left++;
		}
		for(int[] a : ar){
			for(int x : a){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
	public static int Int(){
		return sn.nextInt();
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
	public static long getMS(){
		return System.currentTimeMillis();
	}
	public static char[] chararr(String s){
		return s.toCharArray();
	}
}
