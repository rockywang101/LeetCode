package LeetCode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * 
 * iterative version
 * 
 * Runtime: 4 ms, faster than 99.82% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
 * Memory Usage: 42.2 MB, less than 5.10% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
 * 
 * @author rocky
 */
public class A0235_LowestCommonAncestorOfABinarySearchTree_V1 {

	// 參考了 V2 的作法後，再寫一版
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		TreeNode curr = root;
		boolean hasAnswer = false;
		while (! hasAnswer) {
			if (p.val > curr.val && q.val > curr.val)
				curr = curr.right;
			else if (p.val < curr.val && q.val < curr.val)
				curr = curr.left;
			else
				hasAnswer = true;
		}
		
		return curr;
	}

	/* 最初一開始自己想的版本，概念大概一樣
	 * 6 -> 4
	 * 6 -> 4 -> 2
	 * get final same node
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode prev = root;
		TreeNode x = root;
		TreeNode y = root;
		
		while (x != null || y != null) {
			
			if (x == null || y == null || x.val != y.val)
				return prev;
			
			prev = x; // x == y
			
			if (x.val == p.val)
				x = null;
			else
				x = x.val > p.val ? x.left : x.right;
				
			if (y.val == q.val)
				y = null;
			else 
				y = y.val > q.val ? y.left : y.right;
		}
		
		return null;
	}
	*/
}
