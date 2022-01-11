import java.io.*;
import java.util.*;
public class FindPath{
	public static void solve(int n, int m, int[][] ar, List<List<Integer>> q){
		for(List<Integer> l : q){
			int sX = l.get(0), sY = l.get(1), eX = l.get(2), eY = l.get(3);
			int[][] dp = new int[eX+1][eY+1];
		}
	}
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		int n = Int();
		int m = Int();
		int[][] ar = new int[n][m];
		for(int i=0; i<n; i++) for(int j=0; j<m; j++) ar[i][j] = Int();
		int q = Int();
		List<List<Integer>> queries = new ArrayList<>();
		while(q-->0){
			List<Integer> temp = new ArrayLit<>();
			temp.add(Int());
			temp.add(Int());
			temp.add(Int());
			temp.add(Int());
			queries.add(new ArrayList<>>(temp));
		}
		solve(n, m, ar, queries);
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
