import java.io.*;
import java.util.*;
public class DirectedGraph {
    public List<List<Integer>> adj;
    public int V;
    DirectedGraph(int V){
        this.V = V;
        adj = new ArrayList<>(V);
        for(int i=0; i<V; i++) adj.add(new ArrayList<>());
    }
    public void addEdge(int s, int e){
        adj.get(s).add(e);
    }

    public void print(){
        for(int i=0; i<V; i++){
            System.out.printf("Vertex %d :", i);
            for(int x : adj.get(i)) System.out.printf(" %d", x);
            System.out.println();
        }
    }
    public boolean isCyclic(int start, boolean[] visit, boolean[] rec){
        if(rec[start]) return true;
        if(visit[start]) return false;
        visit[start] = true;
        rec[start] = true;
        for(int x : adj.get(start)){
            if(isCyclic(x, visit, rec)) return true;
        }
        rec[start] = false;
        return false;
    }
    public boolean isCyclic(){
        boolean[] visit = new boolean[V];
        boolean[] rec = new boolean[V];
        for(int i=0; i<V; i++){
            if(isCyclic(i, visit, rec)) return true;
        }
        return false;
    }
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int V = sn.nextInt();
        DirectedGraph d = new DirectedGraph(V);
        while(true){
            int s = sn.nextInt();
            int e = sn.nextInt();
            if(s==-1&&e==-1) break;
            d.addEdge(s, e);
        }
        d.print();
        System.out.println(d.isCyclic());
    }
}
