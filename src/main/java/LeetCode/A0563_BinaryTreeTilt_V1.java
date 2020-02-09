package LeetCode;

/**
 * https://leetcode.com/problems/binary-tree-tilt/
 * 
 * Runtime: 10 ms, faster than 12.37% of Java online submissions for Binary Tree Tilt.
 * Memory Usage: 41.5 MB, less than 9.09% of Java online submissions for Binary Tree Tilt.
 * 
 * @author rocky
 */
public class A0563_BinaryTreeTilt_V1 {

	public int findTilt(TreeNode root) {
		
		if (root == null)
			return 0;
		
		return tiltOfOneNode(root) + findTilt(root.left) + findTilt(root.right);
	}
	
    public int tiltOfOneNode(TreeNode node) {
     
    	if (node == null)
    		return 0;
    	
    	return Math.abs(sumOfNode(node.left) - sumOfNode(node.right));
    }
    
    private int sumOfNode(TreeNode node) {
    	
    	if (node == null)
    		return 0;
    	
    	return node.val + sumOfNode(node.left) + sumOfNode(node.right);
    }
}
