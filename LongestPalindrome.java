import java.io.*;
import java.util.*;
public class LongestPalindrome{
	public static void find(char[] ar){
		int n = ar.length, x = 0, y = 0, len = 0;
		for(int i=0; i<n; i++){
			if(i==0) continue;
			int[] co = expand(ar, i, i+1, n);
			if(len<co[1]-co[0]){
				len = co[1]-co[0];
				x = co[0];
				y = co[1];
			}
			co = expand(ar, i-1, i+1, n);
			if(len<co[1]-co[0]){
				len = co[1]-co[0];
				x = co[0];
				y = co[1];
			}
		}
		System.out.println(new String(ar).substring(x+1, y));
	}
	public static int[] expand(char[] ar, int i, int j, int n){
		int x = i, y = j;
		while(x>=0&&y<n){
			if(ar[x]!=ar[y]) break;
			x--; y++;
		}
		return new int[]{x, y};
	}
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		find(chararr(sn.next()));
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
