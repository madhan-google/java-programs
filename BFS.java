import java.io.*;
import java.util.*;
public class BFS{
	public int n;
	public List<List<Integer>> adj;
	BFS(int n){
		this.n = n;
		adj = new ArrayList<>();
		for(int i=0; i<n; i++) adj.add(new ArrayList<>());
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
	public void bfs(int start){
		boolean[] visit = new boolean[n];
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visit[start] = true;
		while(!q.isEmpty()){
			// int size = q.size();
			int cur = q.poll();
			System.out.print(String.format("[%d]->", cur));
			for(int x : adj.get(cur)){
				if(!visit[x]) {
					visit[x] = true;
					q.offer(x);
				}
			}
		}
	}
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		BFS b = new BFS(Int());
		while(true){
			int s = Int();
			int e = Int();
			if(s==-1&&e==-1) break;
			b.addEdge(s, e);
		}
		b.showGraph();
		System.out.println();
		b.bfs(0);
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
