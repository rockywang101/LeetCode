package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
 * Memory Usage: 36 MB, less than 99.04% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
 * @author rocky
 */
public class A0103_BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    
    	List<List<Integer>> rtnList = new ArrayList<List<Integer>>();
    	
    	visitNode(root, rtnList, 0);
    	
    	return rtnList;
    }
    
    private void visitNode(TreeNode node, List<List<Integer>> rtnList, int level) {

    	if (node == null)
    		return;
    	
    	if (rtnList.size() == level)
    		rtnList.add(new ArrayList<Integer>());
    	
    	if (level % 2 == 0)
    		rtnList.get(level).add(node.val);
    	else
    		rtnList.get(level).add(0, node.val);

    	visitNode(node.left, rtnList, level+1);
    	visitNode(node.right, rtnList, level+1);
    }
}
