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
class A extends Thread{
	Robot r;
	A() throws Exception{
		r = new Robot();
	}
	public void run(){
	}
}
public class RobotRough{
	public static void name(  ){

	}
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception {
		// A a = new A();
		Runtime.getRuntime().exec("start Run_SQL_Command_Line");
		// Runtime.getRuntime().exec("cd D:\\programs");
		sleep(1000);
		// Robot r = new Robot();
		// try{
		// 	r.keyPress(KeyEvent.VK_H);
		// 	Thread.sleep(1000);
		// 	r.keyPress(KeyEvent.VK_ENTER);
		// 	Thread.sleep(1000);

		// 	// r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		// 	r.keyRelease(KeyEvent.VK_ENTER);
		// 	r.keyPress(KeyEvent.VK_H);
		// }catch(Exception e){

		// }
		// a.start();
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
