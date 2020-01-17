package LeetCode;

/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum of Left Leaves.
 * Memory Usage: 40.3 MB, less than 6.52% of Java online submissions for Sum of Left Leaves.
 * 
 * @author rocky
 */
public class A0404_SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
    	
    	if (root == null)
    		return 0;
        
		return sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
	}
    
    
    private int sumOfLeftLeaves(TreeNode node, boolean isLeft) {
    	
    	if (node == null)
    		return 0;
    	// 都沒有小孩了，在左邊的回傳 node 值，在右邊的回傳 0
    	if (node.left == null && node.right == null)
    		return isLeft ? node.val : 0;

    	return sumOfLeftLeaves(node.left, true) + sumOfLeftLeaves(node.right, false);
    }
}
