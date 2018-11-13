package com.leetcode.easy;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int flag = 0;
        ListNode res = new ListNode(0);
        ListNode current = res;
        while (l1!=null||l2!=null){
            ListNode node = new ListNode(0);
            int x = l1==null?0:l1.val;
            int y = l2==null?0:l2.val;
            if(x+y+flag>=10){
                node.val = (x+y+flag)%10;
                flag = 1;
            }
            else {
                node.val = x+y+flag;
                flag = 0;
            }
            current.next = node;
            current = node;
            l1 = l1==null?null:l1.next;
            l2 = l2==null?null:l2.next;
        }
        if(flag !=0){
            current.next = new ListNode(1);
        }
        return res.next;
    }
}

