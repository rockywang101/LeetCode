package LeetCode;

/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
 * Memory Usage: 47.8 MB, less than 8.89% of Java online submissions for Search in a Binary Search Tree.
 * 
 * @author rocky
 */
public class A0700_SearchInABinarySearchTree_V2 {

    public TreeNode searchBST(TreeNode root, int val) {
        
        while (root != null) {
            
            if (root.val == val)
                return root;
            
            if (root.val < val)
                root = root.right;
            else 
                root = root.left;
        }
        
        return null;
    }
}
