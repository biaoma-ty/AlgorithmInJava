package leetcode;

import java.util.Stack;

/**
 * Created by F7753 on 6/6/16.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if(head==null) return head;

        ListNode reverseHead = null;
        ListNode node = head;
        ListNode prev = null;
        while (node != null) {
            ListNode next = node.next;
            if (next == null)
                reverseHead = node;
            node.next = prev;

            prev = node;
            node = next;
        }

        return reverseHead;
    }
}
