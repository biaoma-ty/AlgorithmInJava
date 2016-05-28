/**
 * Created by F7753 on 5/27/16.
 * Given a linked list, remove the nth node
 * from the end of list and return its head.
 *
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || n == 0)
            return  head;
        ListNode ahead = head;

        for (int i = 0; i < n; i++) {
            if (ahead.next != null)
                ahead = ahead.next;
            else
                return null;
        }

        ListNode behind = head;
        while (ahead.next != null) {
            ahead = ahead.next;
            behind = behind.next;
        }

        behind.next = behind.next.next;

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}
