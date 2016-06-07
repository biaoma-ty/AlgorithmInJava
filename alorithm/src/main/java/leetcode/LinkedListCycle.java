package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by F7753 on 6/7/16.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        int cnt = 0;
        while (head != null) {
            if (set.contains(head))
                return true;
            set.add(head);
            System.out.println(head.val);
            head = head.next;
            cnt ++;
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
