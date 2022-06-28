import java.io.*;
import java.util.*;
public class FindCousin {
    static class Node{
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static Node add(Node root, int val){
        if(root==null) return new Node(val);
        if(root.val<val) root.right = add(root.right, val);
        else if(root.val>val) root.left = add(root.left, val);
        return root;
    }
    public static boolean isSibling(Node root, int a, int b){
        return (root==null||root.left==null||root.right==null)?false:(root.left.val==a&&root.right.val==b||root.right.val==a&&root.left.val==b||isSibling(root.left, a, b)||isSibling(root.right, a, b));
    }
    public static int getLevel(Node root, int a){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int level = 0;
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                Node cur = q.poll();
                if(cur.val==a) return level;
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
            }
            level++;
        }
        return -1;
    }
    public static void print(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int len = q.size();
            for(int i=0; i<len; i++){
                Node cur = q.poll();
                System.out.print(cur.val+" ");
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
            }
            System.out.println();
        }

    }
    public static boolean isCousin(Node root, int a, int b){
        return root==null?false:(getLevel(root, a)==getLevel(root, b)&&!isSibling(root, a, b));
    }
    public static final Scanner sn = new Scanner(System.in);
    public static final Random rn = new Random();
    public static void main(String[] args) {
        int n = sn.nextInt();
        Node root = null;
        for(int i=0; i<n; i++){
            root = add(root, rn.nextInt(50));
        }
        print(root);
        int a = sn.nextInt();
        int b = sn.nextInt();
        System.out.println(isSibling(root, a, b)?"they are siblings":"they are not siblings");
        System.out.println(isCousin(root, a, b)?"they are cousins":"they are not cousins");
    }
}
