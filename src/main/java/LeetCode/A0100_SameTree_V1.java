package LeetCode;

/**
 * https://leetcode.com/problems/same-tree/
 * 
 * @author rocky
 */
public class A0100_SameTree_V1 {
    
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
    // Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Same Tree.
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // 都是空
        if (p == null && q == null)
            return true;
        // 有一個是空
        if (p == null || q == null)
            return false;
        // 值不同
        if (p.val != q.val)
            return false;
        
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left); 
    }
}
