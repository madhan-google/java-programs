import java.io.*;
import java.util.*;
import java.awt.Event.*;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;
// import java.awt.KeyEvent;
import java.awt.AWTException;
import java.awt.image.BufferedImage;
import javax.imageio.*;
public class QueryInj{
	//10 
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception {
		File file = new File("d:\\programs\\queries.txt");
		FileReader reader = new FileReader(file);
		BufferedReader br = new BufferedReader(reader);
		Robot r = new Robot();
		sleep(1000);
		r.keyPress(KeyEvent.VK_SHIFT);
		for(char ch : "CONNECT".toCharArray()){
			r.keyPress((int)ch);
			sleep(200);
		}
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_ENTER);
			// sleep(100);
		r.keyRelease(KeyEvent.VK_ENTER);
		for(char ch : "SYSTEM".toCharArray()){
			r.keyPress((int)ch);
			sleep(200);

		}
		r.keyPress(KeyEvent.VK_ENTER);
			// sleep(100);
		r.keyRelease(KeyEvent.VK_ENTER);
		for(char ch : "GOOGLE".toCharArray()){
			r.keyPress((int)ch);
			sleep(200);

		}
		r.keyPress(KeyEvent.VK_ENTER);
			// sleep(100);
		r.keyRelease(KeyEvent.VK_ENTER);
		String line = "";
		// Runtime.getRuntime().exec("notepad.exe");
		sleep(2000);
		while((line=br.readLine())!=null){
			StringSelection selection = new StringSelection(line);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(selection, selection);
			sleep(200);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			sleep(500);
			r.keyPress(KeyEvent.VK_ENTER);
			sleep(100);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		r.keyRelease(KeyEvent.VK_ENTER);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		sleep(500);
		Runtime.getRuntime().exec("notepad.exe");
		sleep(500);
		// r.close();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		// r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}
	public static void sleep(int time){
		try{
			Thread.sleep(time);
		}catch(Exception e){

		}
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
