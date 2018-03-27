package com.company;

/**
 * Created by ht706 on 18-3-26.
 */
public class DeleteDupNodes {
    public static ListNode deleteDupNodes(ListNode head) {
        if(head == null)
            return null;
        ListNode index = head;
        ListNode first = index;

        while(head != null) {
            if(head.val != index.val) {
                index.next = head;
                index = index.next;
            }
            head = head.next;
        }
        index.next = null;
        return first;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(2);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        MergeTwoLists.displayList(deleteDupNodes(l1));
    }
}
