import java.io.*;
import java.util.*;
public class KickstartA1 {
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sn.nextInt();
        for(int ii=1; ii<=T; ii++){
            String a = sn.next();
            String b = sn.next();
            Map<Character, Integer> mapA = new HashMap<>();
            Map<Character, Integer> mapB = new HashMap<>();
            Set<Character> set = new HashSet<>();
            for(char ch : a.toCharArray()) {
                mapA.put(ch, mapA.getOrDefault(ch, 0)+1);
                set.add(ch);
            }
            for(char ch : b.toCharArray()) mapB.put(ch, mapB.getOrDefault(ch, 0)+1);
            int count = 0;
            String res = "";
            // for(char ch : a.toCharArray()) set.add(ch);
            for(char ch : set){
                // if(!set.contains(ch)){
                if(!mapB.containsKey(ch) || mapA.get(ch).intValue()>mapB.get(ch).intValue()){
                    res = "IMPOSSIBLE";
                    break;
                }
                count += mapB.get(ch).intValue() - mapA.get(ch).intValue();
                // }
                // set.add(ch);
            }
            if(res!=""){
                System.out.printf("Case #%d: %s\n", ii, res);
            }else{
                System.out.printf("Case #%d: %d\n", ii, count);
            }
        }
    }
}
