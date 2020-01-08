package LeetCode;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Minimum Depth of Binary Tree.
 * Memory Usage: 38.5 MB, less than 98.44% of Java online submissions for Minimum Depth of Binary Tree.
 * 
 * @author rocky
 */
public class A0111_MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
   
    	if (root == null)
    		return 0;
    	
    	if (root.left == null)
    		return 1 + minDepth(root.right);
    	else if (root.right == null)
    		return 1 + minDepth(root.left);
    	else
    		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
