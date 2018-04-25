package com.company;

/**
 * Created by ht706 on 18-4-24.
 */
public class SwapListNode {

    /**
     * 额外创建头结点后，处理起来比较清晰
     * @param head
     * @return
     */
    public static ListNode swapByThree(ListNode head) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode cur = root;
        while(cur.next != null && cur.next.next != null && cur.next.next.next != null) {
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            first.next = second.next;
            second.next = first;
            cur.next = second;
            cur = cur.next.next.next;
        }
        return root.next;
    }
    public static ListNode swapByPairs(ListNode head) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode cur = pre;
        while(cur.next != null && cur.next.next != null) {
            ListNode first = cur.next;
            ListNode second = cur.next.next;
            first.next = second.next;
            cur.next = second;
            second.next = first;
            cur = cur.next.next;
        }
        return pre.next;
    }

    /**
     * 不带头节点的怎么处理？
     * @param head
     * @return
     */
    public static ListNode swapByPairs2(ListNode head) {

        return head;

    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        ListNode l8 = new ListNode(8);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        MergeTwoLists.displayList(swapByPairs2(l1));

    }
}
