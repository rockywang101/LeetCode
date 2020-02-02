package LeetCode;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * 
 * recursive version
 * 
 * 有點類似這題的找 path: https://leetcode.com/problems/path-sum-ii/
 * 
 * Runtime: 195 ms, faster than 5.00% of Java online submissions for Lowest Common Ancestor of a Binary Tree.
 * Memory Usage: 43.1 MB, less than 5.55% of Java online submissions for Lowest Common Ancestor of a Binary Tree.
 * 
 * @author rocky
 */
public class A0236_LowestCommonAncestorOfABinaryTree_V1 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		LinkedList<TreeNode> pathP = findPath(root, p);
		LinkedList<TreeNode> pathQ = findPath(root, q);

		TreeNode ancestorNode = null;
		int size = Math.min(pathP.size(), pathQ.size());
		for (int i=0; i<size; i++) {
			TreeNode currP = pathP.get(i);
			TreeNode currQ = pathQ.get(i);
			
			if (currP == null || currQ == null || currP.val != currQ.val)
				return ancestorNode;
			
			// currP.val == currQ.val
			ancestorNode = currP;
		}
		
		return ancestorNode;
	}
	
	private LinkedList<TreeNode> findPath(TreeNode node, TreeNode target) {

		LinkedList<TreeNode> path = new LinkedList<TreeNode>();
		visitNode(node, target, path, new AtomicBoolean(false));
		return path;
	}
	
	private void visitNode(TreeNode node, TreeNode target, LinkedList<TreeNode> path, AtomicBoolean isFound) {
		if (node == null || isFound.get())
			return;

		path.add(node);
		if (node.val == target.val) {
			isFound.set(true);
			return;
		}

		visitNode(node.left, target, path, isFound);
		visitNode(node.right, target, path, isFound);
		
		if (! isFound.get())
			path.removeLast();
	}
}
