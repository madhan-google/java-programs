import java.io.*;
import java.util.*;
public class DFS{
	public List<List<Integer>> adj;
	public int n;
	boolean[] visit;
	DFS(int n){
		this.n = n;
		visit = new boolean[n];
		adj = new ArrayList<>();
		for(int i=0; i<n; i++) adj.add(new ArrayList<>());
	}
	public void dfs(int start){
		System.out.print(start+" -> ");
		visit[start] = true;
		for(int x : adj.get(start)){
			if(!visit[x]) dfs(x);
		}
	}
	public void addEdge(int s, int e){
		adj.get(s).add(e);
	}
	public void showGraph(){
		for(int i=0; i<n; i++){
			System.out.print(i+" -> ");
			for(int x : adj.get(i)){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		DFS d = new DFS(Int());
		while(true){
			int s = Int();
			int e = Int();
			if(s==-1&&e==-1) break;
			d.addEdge(s, e);
		}
		d.showGraph();
		System.out.println();
		d.dfs(0);
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
