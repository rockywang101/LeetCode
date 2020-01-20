package LeetCode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * 
 * 
 * Runtime: 18 ms, faster than 13.66% of Java online submissions for Diameter of Binary Tree.
 * Memory Usage: 46.5 MB, less than 5.19% of Java online submissions for Diameter of Binary Tree.
 * 
 * @author rocky
 */
public class A0543_DiameterOfBinaryTree_V1 {

    public int diameterOfBinaryTree(TreeNode root) {

    	AtomicInteger max = new AtomicInteger(0);
    	
    	maxDiameterOfRootNode(root, max);
    	
    	return max.intValue();
    }
    
    private void maxDiameterOfRootNode(TreeNode root, AtomicInteger max) {
    	
    	if (root == null)
    		return;
    	
    	int curr = diameterOfRootNode(root);
    	
    	if (curr > max.intValue())
    		max.set(curr);
    	
    	maxDiameterOfRootNode(root.left, max);
    	maxDiameterOfRootNode(root.right, max);
    }
    
    private int diameterOfRootNode(TreeNode root) {

    	if (root == null)
    		return 0;

    	AtomicInteger leftCnt = new AtomicInteger(1);
    	AtomicInteger rightCnt = new AtomicInteger(1);
    	
    	maxPath(root.left, 1, leftCnt);
    	maxPath(root.right, 1, rightCnt);
    	
    	return leftCnt.intValue() + rightCnt.intValue() - 2;
    }
    
    private void maxPath(TreeNode node, int currCnt, AtomicInteger maxCnt) {
    	
    	if (node == null)
    		return;
    	currCnt++;
    	
    	if (currCnt > maxCnt.intValue())
    		maxCnt.set(currCnt);
    	
    	maxPath(node.left, currCnt, maxCnt);
    	maxPath(node.right, currCnt, maxCnt);
    }
    
    public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		
		int n = new A0543_DiameterOfBinaryTree_V1().diameterOfBinaryTree(root);
System.out.println(n);
	}
}
