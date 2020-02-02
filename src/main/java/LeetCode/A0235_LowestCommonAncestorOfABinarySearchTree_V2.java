package LeetCode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * 
 * recursive version
 * 
 * this question commit time is very unstable, sometimes is fast, and sometimes is slow
 * 
 * Runtime: 11 ms, faster than 5.61% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
 * Memory Usage: 47.4 MB, less than 5.10% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
 * 
 * @author rocky
 */
public class A0235_LowestCommonAncestorOfABinarySearchTree_V2 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// 都大於
		if (p.val > root.val && q.val > root.val)
			return lowestCommonAncestor(root.right, p, q);
		
		// 或都小於，才會有更下面的 common ancestor
		if (p.val < root.val && q.val < root.val)
			return lowestCommonAncestor(root.left, p, q);
		
		// 沒有都大於或都小於的話，代表現在的節點就是 common ancestor
		return root;
	}
}
