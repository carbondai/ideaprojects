package com.company;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by ht706 on 18-3-17.
 */
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int x){
        val = x;
    }
}

class MyList {
    private ListNode head;
    public void MyList(){
        head = null;
    }
    public void insertNode(int x) {
        ListNode l = new ListNode(x);
        l.next = head;
        head = l;
    }
    public void displayList() {
        while(head.next != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println(head.val);
    }
}

public class MergeTwoLists {
    public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode current = new ListNode(0);
        ListNode head = current;
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        while(l1 != null && l2 !=null) {
            if(l1.val < l2.val) {
                current.next = l1;
                current = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                current = l2;
                l2 = l2.next;
            }
        }
        if(l1 != null) {
            current.next = l1;
        }
        if(l2 != null) {
            current.next = l2;
        }
        return head.next ;
    }

    public static void displayList(ListNode head) {
        while(head.next != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println(head.val);
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(5);
        ListNode l4 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(4);
        ListNode l7 = new ListNode(6);
        l5.next = l6;
        l6.next = l7;
        ListNode l = merge(l1, l5);
        displayList(l);


    }
}
