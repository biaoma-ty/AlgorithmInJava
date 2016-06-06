package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by F7753 on 6/6/16.
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<Integer>();
        ListNode prev = head;
        ListNode current = head;
        while (current!= null) {
            if (set.contains(current.val)) {
                prev.next = current.next;
            } else {
                set.add(current.val);
                prev = current;
            }
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        RemoveDuplicatesfromSortedList rm = new RemoveDuplicatesfromSortedList();
        rm.deleteDuplicates(node0);
        while (node0 != null) {
            System.out.println(node0.val);
            node0 = node0.next;
        }
    }
}