import java.util.Scanner;

public class SubarraySum {
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sn.nextInt();
        int k = sn.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++)
            ar[i] = sn.nextInt();
        int left = 0, right = 0;
        int sum = 0;
        while(right<n){
            sum += ar[right];
            while(sum>k){
                sum -= ar[left];
                left++;
            }
            if(sum==k){
                System.out.println(left+" "+right);
                return;
            }
            right++;
        }
    }    
}
