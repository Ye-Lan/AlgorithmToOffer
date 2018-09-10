package com.yelan;

/*
* 输入两个链表，找出它们的第一个公共结点。
*
* 当链表有公共结点时，从该结点开始，该链表会一样
*
* 主要解决问题：链表长度不一的时候，如何遍历（形成一个环形）
*
* */

import java.util.List;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class 两个链表的第一个公共结点 {
    public static void main(String[] args){

    }

    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2){
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;

        while (p1 != p2){
            p1 = (p1 == null) ? pHead2 : p1.next;
            p2 = (p2 == null) ? pHead1 : p2.next;
        }
        return pHead1;
    }
}
