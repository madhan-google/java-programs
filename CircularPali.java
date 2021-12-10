import java.io.*;
import java.util.*;
public class CircularPali{
	public static List<Integer> circularPalindromes(String s) {
        List<Integer> res = new ArrayList<>();
        int n = s.length();
        for(int II=0; II<n; II++){
            int max = -1;
            char[] ar = s.toCharArray();
            int mid = n/2;
            // int i = mid, j = mid;
            for(int i=0; i<mid; i++){
            	max = Math.max(max, getMax(ar, i, n));
            }
            for(int i=mid; i<n; i++){
            	max = Math.max(max, getMax(ar, i, n));
            }
            res.add(max);
            s = s.substring(1, n)+s.charAt(0);
            // System.out.println(s);
        }
        return res;

    }
    public static int getMax(char[] ar, int j, int n){
    	int len = 0, x = 0, y = 0;
    	int[] co = expand(ar, j-1, j+1, n);
        if(len<co[1]-co[0]){
			len = co[1]-co[0];
			x = co[0];
			y = co[1];
		}
        co = expand(ar, j, j+1, n);
        if(len<co[1]-co[0]){
			len = co[1]-co[0];
			x = co[0];
			y = co[1];
		}
		return y-x-1;
    }
    public static int[] expand(char[] ar, int i, int j, int n){
        int x = i, y = j;
        while(x>=0&&y<n){
            if(ar[x]!=ar[y]) break;
            x--; y++;
        }
        return new int[]{x, y};
    }
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		System.out.println(circularPalindromes(sn.next()));
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
