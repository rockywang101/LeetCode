package LeetCode;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * https://leetcode.com/problems/path-sum/
 * 
 * @author rocky
 */
public class A0112_PathSum {

    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
    // Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Path Sum.
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if (root == null)
            return false;
        
        AtomicBoolean hasPathSum = new AtomicBoolean(false);
        
        hasPathSum(root, 0, sum, hasPathSum);
        
        return hasPathSum.get();
    }
    
    
    private void hasPathSum(TreeNode node, int currSum, int targetSum, AtomicBoolean hasPathSum) {

        if (hasPathSum.get())
            return;
        
        if (node.left == null && node.right == null && (currSum + node.val) == targetSum) {
            hasPathSum.set(true);
            return;
        }
        
        if (node.left != null)
            hasPathSum(node.left, currSum+node.val, targetSum, hasPathSum);

        if (node.right != null)
            hasPathSum(node.right, currSum+node.val, targetSum, hasPathSum);
    }
}
