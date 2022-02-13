import java.io.*;
import java.util.*;
class PolynomialAddition{
    public static class Node{
        Node next;
        int val;
        int pow;
        // Node(){}
        Node(int val, int pow){
            this.val = val;
            this.pow = pow;
            this.next = null;
        }
    }
    public static Node insert(int val, int pow, Node head){
        Node newnode = new Node(val, pow);
        if(head==null) return newnode;
        Node cur = head;
        while(cur.next!=null) cur = cur.next;
        cur.next = newnode;
        // System.out.printf(" %dx^%d ", newnode.val, newnode.pow);
        return head;
    }
    public static Node add(Node p1, Node p2){
        Node res = null;
        while(p1!=null&&p1!=null){
            if(p1.pow<p2.pow){
                res = insert(p2.val, p2.pow ,res);
                p2 = p2.next;
            }else if(p1.pow>p2.pow){
                res = insert(p1.val, p1.pow, res);
                p1 = p1.next;
            }else{
                res = insert(p1.val+p2.val, p2.pow, res);
                p1 = p1.next;
                p2 = p2.next;
            }
            // res = res.next;
        }
        while(p1!=null){
            res = insert(p1.val, p1.pow, res);
            p1 = p1.next;
        }
        while(p2!=null){
            res = insert(p2.val, p2.pow, res);
            p2 = p2.next;
        }
        return res;
    }
    public static void print(Node head){
        Node cur = head;
        while(cur!=null){
            System.out.printf(" %dX^%d +", cur.val, cur.pow);
            cur = cur.next;
        }
    }
    public static final Scanner sn = new Scanner(System.in);
    public static void main(String[] args) {
        Node p1 = null, p2 = null;
        p1 = insert(5, 5, p1);
        p1 = insert(4, 4, p1);  
        p1 = insert(7, 3, p1);  
        p1 = insert(9, 2, p1);  
        // print(p1);
        p2 = insert(5, 3, p2);  
        p2 = insert(8, 2, p2);  
        p2 = insert(6, 1, p2);  

        print(p1);
        System.out.println();
        print(p2);
        System.out.println("\n------------------------------------");
        print(add(p1, p2));
    }
}