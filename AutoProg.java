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
/*WRITE A C PROGRAM TO PRINT THE SUM OF A GIVEN RANGE OF NUMBERS NOTE USE WHILE LOOP\nINPUT & OUTPUT FORMAT INPUT CONSISTS OF 2 INTEGERS FIRST INPUT CORRESPONDS TO THE MINIMUM VALUE OF THE RANGE SECOND INPUT CORRESPONDS TO THE MAXIMUM VALUE OF THE RANGE THE OUTPUT IS AN INTEGER WHICH CORRESPONDS TO THE SUM OF RANGE*/
public class AutoProg{
	// public static int[] alpha = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
	public static final Scanner sn = new Scanner(System.in);
	public static final Random rn = new Random();
	public static final PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		try{
            sleep(2000);
            Robot r = new Robot();
            // System.out.println((KeyEvent));
            String s = sn.nextLine();
            Runtime.getRuntime().exec("notepad.exe");
   //          StringSelection selection = new StringSelection(theString);
			// Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			// clipboard.setContents(selection, selection);
            sleep(2000);
            for(char ch : s.toCharArray()){
            	r.keyPress((int)ch);
            	sleep(200);
            	// r.keyPress(20);
            }
            // r.keyPress(20);
            // sleep(2000);
            // r.keyPress(20);

            
        }catch(Exception e){

        }
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
