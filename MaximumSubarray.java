import java.io.*;
import java.util.*;
public class MaximumSubarray{
	public static void go(){
		int n = Int();
		long m = Long();
		long[] ar = new long[n];
		for(int i=0; i<n; i++){
			long num = Long() % m;
			if(i==0){
				ar[i] = num;
			}else{
				ar[i] = (ar[i-1] + num) % m;
			}
		}
		// ar.forEach(i->System.out.print(i+" "));
		// for(long x : ar) System.out.print(x+" ");
		System.out.println();
		TreeSet<Long> set = new TreeSet<>();
		long max = -1;
		for(long x : ar){
			if(set.isEmpty()){
				max = x;
				set.add(x);
			}else{
				max = Math.max(max, x);
				Long next = set.ceiling(x+1);
				if(next != null){
					max = Math.max(max, (x-next+m));
				}
				set.add(x);
			}
			System.out.println(set);
		}
		System.out.println(max);
	}
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)); //out.printf("%.8f\n", ans);
	public static void main(String[] args) {
		int T = Int();
		while( T-- > 0 ){
			go();
		}
	}
	public static void _s(){
		System.out.print(" ");
	}
	public static long getMS(){
		return System.currentTimeMillis();
	}
	public static int Int(){
		return sn.nextInt();
	}
	public static String string(){
		return sn.nextLine();
	}
	public static char Char(){
		return sn.next().charAt(0);
	}
	public static float Float(){
		return sn.nextFloat();
	}
	public static double Double(){
		return sn.nextDouble();
	}
	public static long Long(){
		return sn.nextLong();
	}
	public static void printf(String format_){
		print(String.format(format_));
	}
	public static void print(String sss){
		System.out.print(sss);
	}
	public static void fill(int[] ar, int n){
		Arrays.fill(ar, n);
	}
	public static char[] chararr(String s){
		return s.toCharArray();
	}
}
