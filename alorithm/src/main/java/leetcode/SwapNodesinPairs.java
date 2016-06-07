package leetcode;

/**
 * Created by F7753 on 6/7/16.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode curr = head;
        ListNode next = head.next;
        ListNode newHead = next;

        curr.next = next.next;
        next.next = curr;

        if (curr.next == null)
            return newHead;

        while (curr.next.next != null) {
            ListNode prev = curr;
            curr = curr.next;
            next = curr.next;

            prev.next = next;
            curr.next = next.next;
            next.next = curr;

            if (curr.next == null || curr.next.next == null)
                break;

        }

        return newHead;
    }
}
