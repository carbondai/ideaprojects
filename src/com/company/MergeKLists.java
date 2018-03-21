package com.company;

/**
 * Created by ht706 on 18-3-21.
 */
public class MergeKLists {
    public static ListNode mergeKList(ListNode[] lists){
        ListNode temp = lists[0];
        for(int i=0; i<lists.length -1 ; i++) {
            temp = MergeTwoLists.merge(temp, lists[i+1]);
        }
        return temp;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(3);
        ListNode l7 = new ListNode(8);
        l5.next = l6;
        l6.next = l7;
        ListNode l8 = new ListNode(3);
        ListNode l9 = new ListNode(5);
        ListNode l10 = new ListNode(7);
        l8.next = l9;
        l9.next = l10;
        ListNode[] ls = {l8, l1};
        MergeTwoLists.displayList(mergeKList(ls));
    }
}
