import java.io.*;
import java.util.*;
public class KnightProblem {
    public static int count = 0;
    public static int min;
    public static boolean found;
    public static int solve(int n, int m, int sx, int sy, int ex, int ey){
        min = Integer.MAX_VALUE;
        found = false;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if((sx==i&&sy==j)||(ex==i&&ey==j))System.out.print("X ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
        sn.next();
        boolean[][] visit = new boolean[n][m];
        dfs(n, m, sx, sy, ex, ey, visit);
        return count;
        // return 0;
    }
    public static void dfs(int n, int m, int i, int j, int ex, int ey, boolean[][] visit){
        if(i==ex&&j==ey){
            found = true;
            return;
        }
        if(i<n&&j<m&&i>=0&&j>=0&&!visit[i][j]){
            count++;
            visit[i][j] = true;
            dfs(n, m, i-2, j+1, ex, ey, visit);
            dfs(n, m, i-2, j-1, ex, ey, visit);
            dfs(n, m, i+2, j+1, ex, ey, visit);
            dfs(n, m, i+2, j-1, ex, ey, visit);
            // visit[i][j] = false;
        }
    }
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(solve(Int(), Int(), Int(), Int(), Int(), Int()));
    }
    public static int Int(){
        return sn.nextInt();
    }
}
