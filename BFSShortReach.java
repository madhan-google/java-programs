import java.io.*;
import java.util.*;

class Solution{
    public static List<List<Integer>> adj;
    public static boolean[] visit;
    // public static int[][] dirs;
    public static int n, m;
    public static int[] map;
    public static void add(int s, int e){
        adj.get(s).add(e);
        adj.get(e).add(s);
    }
    public static void init(){
        adj = new ArrayList<>();
        for(int i=0; i<n; i++) adj.add(new ArrayList<>());
        visit = new boolean[n];
        map = new int[n];
        Arrays.fill(map, -1);
        // dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    }
    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visit[start] = true;
        // map[start] = 6;
        while(!q.isEmpty()){
            int cur = q.poll();
            // map[cur] = 6;
            for(int x : adj.get(cur)){
                if(!visit[x]){
                    visit[x] = true;
                    q.offer(x);
                    map[x] = map[cur]==-1?map[cur]+7:map[cur]+6;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(i!=start){
                System.out.print(map[i]+" ");
            }
        }
        System.out.println();
    }
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sn.nextInt();
        while(T-->0){
            n = sn.nextInt();
            m = sn.nextInt();
            init();
            for(int i=0; i<m; i++) add(sn.nextInt()-1, sn.nextInt()-1);
            bfs(sn.nextInt()-1);
        }
    }
}