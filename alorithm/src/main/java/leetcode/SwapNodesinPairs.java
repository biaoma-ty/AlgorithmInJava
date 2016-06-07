package leetcode;

/**
 * Created by F7753 on 6/7/16.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode p1 = head, p2 = head.next, p3 = p2.next;
        p1.next = p3;
        p2.next = p1;

        if (p2 != null) {
            p1.next = swapPairs(p3);
        }
        return p2;
    }
}
