package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by F7753 on 6/7/16.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode p = head;
        ListNode q = head;
        while(q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        node0.next = node1;
        node1.next = node2;
        node2.next = node0;
        LinkedListCycle llc = new LinkedListCycle();
        System.out.println(llc.hasCycle(node0));
    }
}
