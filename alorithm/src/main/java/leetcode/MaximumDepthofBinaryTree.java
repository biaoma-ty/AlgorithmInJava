package leetcode;

/**
 * Created by F7753 on 6/4/16.
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        return maxDepth(root, 0);
    }
    private int maxDepth(TreeNode node,int depth)
    {
        if(node==null) return depth;

        return Math.max(maxDepth(node.left,depth+1), maxDepth(node.right, depth+1));
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {value = x;}
}
