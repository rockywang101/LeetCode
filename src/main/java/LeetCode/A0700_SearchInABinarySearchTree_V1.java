package LeetCode;

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * 
 * recursive version
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
 * Memory Usage: 48 MB, less than 8.89% of Java online submissions for Search in a Binary Search Tree.
 * 
 * @author rocky
 */
public class A0700_SearchInABinarySearchTree_V1 {

    public TreeNode searchBST(TreeNode root, int val) {
        
        if (root == null)
            return null;
        
        if (root.val == val)
            return root;
        
        if (root.val > val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }
}
