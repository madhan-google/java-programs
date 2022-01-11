import java.io.*;
import java.util.*;
public class ArithmeticHR{
	public static void name(  ){

	}
	public long getValue(String s){
		String[] nums = s.split("[-*+]");
		String[] ops = s.split("[1-9]");
		int j=0;
		long tot = 0;
		for(int i=0; i<nums.length-1; i+=2){
			switch(ops[j].charAt(0)){
				case '+':
					tot += Long.parseLong(nums[i-1])+Long.parseLong(nums[i]);
					break;
				case '-':

			}
			j++;
		}

	}
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) {
		int n = Int();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) list.add(Int());
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
