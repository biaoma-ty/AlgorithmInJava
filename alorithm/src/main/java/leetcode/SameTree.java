package leetcode;

/**
 * Created by F7753 on 6/6/16.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null || p != null && q != null && p.value == q.value && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
}
