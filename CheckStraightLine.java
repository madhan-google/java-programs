import java.io.*;
import java.util.*;
public class CheckStraightLine {
    // [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
    // [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
    // [[1,2],[3,4],[6,7],[8,7]]
    // [[2,1],[4,2],[6,3]]
    public static boolean find(int[][] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length-1; i++){
            int x1 = arr[i][0];
            int x2 = arr[i+1][0];
            int y1 = arr[i][1];
            int y2 = arr[i+1][1];
            set.add((int)((y2-y1)/(x2-x1)));
        }
        return set.size()==1;
    }
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sn.nextInt();
        int[][] ar = new int[n][2];
        for(int i=0; i<n; i++){
            ar[i][0] = sn.nextInt();
            ar[i][1] = sn.nextInt();
        }
        System.out.println(find(ar));
    }
}
