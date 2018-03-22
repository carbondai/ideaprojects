package com.company;

/**
 * Created by ht706 on 18-3-21.
 */
public class MergeKLists {
    public static ListNode mergeKList(ListNode[] lists){
        if(lists == null || lists.length == 0) {
            return null;
        }
        /*
        ListNode temp = lists[0];
        for(int i=0; i<lists.length -1 ; i++) {
            temp = MergeTwoLists.merge(temp, lists[i+1]);
        }
        return temp;
        */
        int n = lists.length;
        while(n>1){
            int k = (n+1)/2;
            for(int i=0; i<n/2; i++) {
                lists[i] = MergeTwoLists.merge(lists[i], lists[n-1-i]);
            }
            n = k;
        }
        return lists[0];
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
        ListNode l11 = new ListNode(1);
        ListNode l12 = new ListNode(3);
        ListNode l13 = new ListNode(10);
        l11.next = l12;
        l12.next = l13;
        ListNode[] ls = {null,  l5, l11};
        MergeTwoLists.displayList(mergeKList(ls));
    }
}
