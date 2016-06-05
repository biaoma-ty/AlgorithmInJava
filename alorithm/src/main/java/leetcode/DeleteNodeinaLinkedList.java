package leetcode;

/**
 * Created by F7753 on 6/6/16.
 */
public class DeleteNodeinaLinkedList {
    public void deleteNode(ListNode node) {
        if (node.next != null)  {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}