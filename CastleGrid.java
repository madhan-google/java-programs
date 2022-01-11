import java.io.*;
import java.util.*;
public class CastleGrid{
	public static int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	public static int bfs(char[][] grid, int sX, int sY, int eX, int eY){
		int n = grid.length;
		int count = 0;
		Queue<int[]> q = new LinkedList<>();
		boolean[][] visit = new boolean[n][n];
		q.add(new int[]{sX, sY});
		visit[sX][sY] = true;
		while(!q.isEmpty()){
			int[] co = q.poll();
			int x = co[0], y = co[1];
			for(int[] dir : dirs){
				int i = x+dir[0];
				int j = y+dir[1];
				// if()
			}
		}
	}
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		int n = Int();
		char[][] grid = new char[n][n];
		char[] sss = {'.', 'X', '.', '.'};
		for(int i=0; i<n; i++) for(int j=0; j<n; j++) grid[i][j] = sss[rn.nextInt(4)];
		for(char[] ar : grid){
			for(char ch : ar) System.out.print(ch+" ");
			System.out.println();
		}
		System.out.println(bfs(grid, 0, 0, 8, 9));
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
