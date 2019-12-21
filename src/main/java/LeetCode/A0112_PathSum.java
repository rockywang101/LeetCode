package LeetCode;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * https://leetcode.com/problems/path-sum/
 * 
 * @author rocky
 */
public class A0112_PathSum {

    // 看了別人的答案，更簡潔的寫法
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
    // Memory Usage: 37.3 MB, less than 100.00% of Java online submissions for Path Sum.
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if (root == null) return false;
        
        sum = sum - root.val;
        
        if (root.left == null && root.right == null && sum == 0)
            return true;

        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
    
    
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
    // Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for Path Sum.
    public boolean hasPathSumV1(TreeNode root, int sum) {
        
        if (root == null)
            return false;
        
        AtomicBoolean hasPathSum = new AtomicBoolean(false);
        
        visitNode(root, 0, sum, hasPathSum);
        
        return hasPathSum.get();
    }
    
    
    private void visitNode(TreeNode node, int currSum, int targetSum, AtomicBoolean hasPathSum) {

        if (hasPathSum.get())
            return;
        
        if (node.left == null && node.right == null && (currSum + node.val) == targetSum) {
            hasPathSum.set(true);
            return;
        }
        
        if (node.left != null)
            visitNode(node.left, currSum+node.val, targetSum, hasPathSum);

        if (node.right != null)
            visitNode(node.right, currSum+node.val, targetSum, hasPathSum);
    }
}
