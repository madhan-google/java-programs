import java.io.*;
import java.util.*;
public class CodeVitaC {
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        String a = sn.nextLine().trim().toLowerCase();
        // sn.next();
        String b = sn.nextLine().trim().toLowerCase();
        // sn.next();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> nMap = new HashMap<>();
        Set<Character> set = new HashSet<>();
        int scount = 0;
        for(char ch : a.toCharArray()){
            if(set.contains(ch)){
                System.out.print("New Language Error");
                return;
            }
            set.add(ch);
        }
        // System.out.println(nMap);
        for(char ch : b.toCharArray()){
            if(Character.isDigit(ch)) nMap.put(ch, nMap.getOrDefault(ch, 0)+1);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            if(ch==' ') scount++;
        }
        // System.out.println(map);
        // System.out.println(nMap);
        for(char ch : a.toCharArray()) if(map.containsKey(ch)&&!Character.isDigit(ch)) for(int i=0; i<map.get(ch); i++) System.out.printf("%c", ch);
        for(int i=0; i<scount; i++) System.out.printf(" ");
        // Set<Character> keys = map.keySet();
        for(char ch : a.toCharArray()) if(Character.isDigit(ch)&&nMap.containsKey(ch)) for(int i=0; i<nMap.get(ch); i++) System.out.printf("%c", ch);
        // System.out.println(res.toString());
    }
}
