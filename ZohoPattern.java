import java.io.*;
import java.util.*;
class ZohoPattern{
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sn.nextInt();
        int[][] ar = new int[n][n];
        int count = 1;
        for(int i=0; i<n; i++){
            int j;
            for(j=0; j<i; j++) ar[i][j] = 0;
            ar[i][j] = count;
            count++;
        }
        boolean down = false, up = true, left = false;
        int end = n-1, start = 1, top = 0, begin = 1;
        for(int ii=n-1; ii>0; ii--){
            if(up){
                for(int i=ii-1; i>=0; i--){
                    ar[i][end] = count;
                    count++;
                }
                end--;
                up = false;
                left = true;
            }else if(left){
                for(int i=end;i>=start;i--){
                    // if(ar[top][i]!=0) break;
                    ar[top][i] = count;
                    count++;
                }
                top++;
                start++;
                // end--;
                left = false;
                down  = true;
            }else if(down){
                int temp = begin;
                for(int i=top; i<=end; i++){
                    ar[i][temp+1] = count;
                    count++;
                    temp++;
                }
                begin++;
                down = false;
                up = true;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ar[i][j]+"\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}