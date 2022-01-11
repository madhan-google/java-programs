import java.io.*;
import java.util.*;
public class DisjointProg {
    static class subset{
        int rank;
        int parent;
        subset(int parent){
            this.parent = parent;
            rank = 0;
        }
    }
    public static int find(int x, subset[] subsets){
        return x==subsets[x].parent?subsets[x].parent:find(subsets[x].parent, subsets); 
    }
    public static boolean union(int x, int y, subset[] subsets){
        int xRoot = find(x, subsets);
        int yRoot = find(y, subsets);
        if(x==y) return false;
        if(subsets[xRoot].rank<subsets[yRoot].rank){
            subsets[xRoot].parent = yRoot;
        }else if(subsets[xRoot].rank>subsets[yRoot].rank){
            subsets[yRoot].parent = xRoot;
        }else{
            subsets[xRoot].parent = yRoot;
            subsets[xRoot].rank++;
        }
        return true;
    }
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sn.nextInt();
        subset[] subsets = new subset[n];
        for(int i=0; i<n; i++) subsets[i] = new subset(i);
        while(true){
            int s = sn.nextInt();
            int e = sn.nextInt();
            if(s==-1&&e==-1) break;
            System.out.println(union(s, e, subsets)?"connected":"already connected");
        }
        System.out.println("find");
        while(true){
            int x = sn.nextInt();
            int y = sn.nextInt();
            if(x==-1&&y==-1) break;
            System.out.println(find(x, subsets)==find(y, subsets)?"connected":"not connected");
        }
    }
}
