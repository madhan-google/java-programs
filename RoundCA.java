import java.io.*;
import java.util.*;
public class RoundCA{
    public static List<String> check(String s){
        boolean spl = false, caps = false, small = false, nums = false;
        for(char ch : s.toCharArray()){
            if(ch=='#'||ch=='&'||ch=='*'||ch=='@') spl = true;
            if(ch<='z'&&ch>='a') small = true;
            if(ch<='Z'&&ch>='A') caps = true;
            if(ch<='9'&&ch>='0') nums = true;
        }
        List<String> ret = new ArrayList<>();
        if(!small) ret.add("small");
        if(!caps) ret.add("caps");
        if(!nums) ret.add("nums");
        if(!spl) ret.add("spl");
        return ret;
    }
    
    // public static boolean
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sn.nextInt();
        for(int ii=1; ii<=T; ii++){
            int n = sn.nextInt();
            String s = sn.next();
            StringBuilder res = new StringBuilder(s);
            List<String> out = check(s);
            for(String str : out){
                switch(str){
                    case "small":
                        res.append('a');
                        break;
                    case "caps":
                        res.append('A');
                        break;
                    case "spl":
                        res.append('#');
                        break;
                    case "nums":
                        res.append('9');
                        break;
                }
            }
            // System.out.println("length "+res.length());
            int len = res.length();
            if(len<7) {
                // System.out.println(true);
                for(int i=0; i<7-len; i++) res.append('1');
            }
            System.out.printf("Case #%d: %s\n", ii, res.toString());
        }
    }
}