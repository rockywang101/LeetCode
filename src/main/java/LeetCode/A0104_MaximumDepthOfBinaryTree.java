package LeetCode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 * easy, just to find the depth
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
 * Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
 * @author rocky
 */
public class A0104_MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
    	
    	if (root == null)
    		return 0;
     
    	return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
