import java.io.*;
import java.util.*;
public class Main{
	public static void go(){

	}
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)); //out.printf("%.8f\n", ans);
	public static void main(String[] args) {
		int T = sn.nextInt();
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
