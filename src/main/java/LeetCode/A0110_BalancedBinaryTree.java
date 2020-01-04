package LeetCode;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 * 
 * Runtime: 1 ms, faster than 98.67% of Java online submissions for Balanced Binary Tree.
 * Memory Usage: 38.3 MB, less than 92.59% of Java online submissions for Balanced Binary Tree.
 * 
 * 第一名的答案並不好懂，且拿去 submit 效能也一樣
 * 
[3,9,20,null,null,15,7]
[1,null,2,null,3]
[1,2,2,3,null,null,3,4,null,null,4]
[1,2,2,3,null,null,3]
 * 
 * @author rocky
 */
public class A0110_BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
    
    	if (root == null)
    		return true;
    	
    	if (root.left == null && root.right == null)
    		return true;
    	
    	return checkBalance(root) && isBalanced(root.left) && isBalanced(root.right);
    }
    
    private boolean checkBalance(TreeNode node) {
    	
    	int leftDepth = getDepth(node.left);
    	int rightDepth = getDepth(node.right);
    	
    	return Math.abs(leftDepth-rightDepth) <= 1;
    }
    
    private int getDepth(TreeNode node) {
    	
    	if (node == null)
    		return 0;
    	
    	return 1 + Math.max(getDepth(node.left), getDepth(node.right));
    }
}
