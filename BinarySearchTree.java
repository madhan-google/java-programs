import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class BinarySearchTree {
    static class node{
        int val;
        node left, right;
        node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static node add(node root, int val){
        if(root==null) return new node(val);
        else{
            if(root.val<val) root.right = add(root.right, val);
            else if(root.val>val) root.left = add(root.left, val);
        }
        return root;
    }
    public static void print(node root){
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                node cur = q.poll();
                int h = height(cur);
                for(int j=0; j<h; j++) System.out.print("  ");
                System.out.print(cur.val);
                if(cur.left!=null) q.offer(cur.left);
                if(cur.right!=null) q.offer(cur.right);
            }
            System.out.println();
        }
    }
    public static int height(node root){
        return root==null ? 0 : 1 + Math.max(height(root.left), height(root.right));
    }
    public static final Scanner sn = new Scanner(System.in);
    public static final Random rn = new Random();
    public static void main(String[] args) {
        int n = sn.nextInt();
        node root = null;
        for(int i=0; i<n; i++){
            root = add(root, rn.nextInt(49));
        }
        print(root);
    }
    
}
