package LeetCode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Diameter of Binary Tree.
 * Memory Usage: 46.7 MB, less than 5.19% of Java online submissions for Diameter of Binary Tree.
 * 
 * @author rocky
 */
public class A0543_DiameterOfBinaryTree_V2 {

    public int diameterOfBinaryTree(TreeNode root) {

    	AtomicInteger maxCount = new AtomicInteger(0);
    
    	recurr(root, maxCount);
    	
    	return maxCount.intValue();
    }
    
    
    private int recurr(TreeNode node, AtomicInteger maxCount) {
    	
    	if (node == null)
    		return 0;
    	
    	int leftCnt = recurr(node.left, maxCount);
    	int rightCnt = recurr(node.right, maxCount);
    	
    	int diameterOfThisNode = leftCnt + rightCnt;
    	if (diameterOfThisNode > maxCount.intValue())
    		maxCount.set(diameterOfThisNode);
    	
    	return Math.max(leftCnt, rightCnt) + 1; // 取左右較大的，並加上自己這一層
    }
    
}    
