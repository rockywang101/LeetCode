package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
 * Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
 * 
 * @author rocky
 */
public class A0094_BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
    	
    	List<Integer> rtnList = new ArrayList<Integer>();
    	
    	visitNode(root, rtnList);
    	
    	return rtnList;
    }
    
    private void visitNode(TreeNode node, List<Integer> rtnList) {
    	
    	if (node == null)
    		return;
    	
    	visitNode(node.left, rtnList); // 重點大概就這邊，先走左邊
    	
    	rtnList.add(node.val); // 再加自己
    	
    	visitNode(node.right, rtnList); // 再走右邊
    }
}
