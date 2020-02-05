package LeetCode;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
 * Memory Usage: 48.6 MB, less than 59.88% of Java online submissions for Range Sum of BST.
 * 
 * @author rocky
 */
public class A0938_RangeSumOfBST_V2 {
    
    public int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null)
            return 0;
        
        int val = root.val >= L && root.val <= R ? root.val : 0;
        
        if (root.val >= R)
            return val + rangeSumBST(root.left, L, R);
        
        if (root.val <= L)
            return val + rangeSumBST(root.right, L, R);
        
        return val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
    
    // 網路上的解答，更簡潔
    public int anotherRangeSumBST(TreeNode root, int L, int R) {
        
        if (root == null)
            return 0;
        
        if (root.val > R)
            return anotherRangeSumBST(root.left, L, R);
        
        if (root.val < L)
            return anotherRangeSumBST(root.right, L, R);
        
        return root.val + anotherRangeSumBST(root.left, L, R) + anotherRangeSumBST(root.right, L, R);
    }
}
