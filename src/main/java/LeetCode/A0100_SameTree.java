package LeetCode;

/**
 * https://leetcode.com/problems/same-tree/
 * 
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 * @author rocky
 */
public class A0100_SameTree {
    
    // 簡化邏輯版本
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
    
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
    // Memory Usage: 34.1 MB, less than 100.00% of Java online submissions for Same Tree.
    public boolean isSameTreeV1(TreeNode p, TreeNode q) {
        // [] vs []
        if (p == null && q == null)
            return true;
        // 比對本身的值
        if ((p == null && q != null) || (p != null && q == null) || p.val != q.val)
            return false;
        // 比對都沒有小孩，代表相同
        if (p.left == null && p.right == null && q.left == null && q.right == null)
            return true;
        // 左右是否 null vs 有值，代表不同
        if ((p.left == null && q.left != null) || (p.left != null && q.left == null)
                || (p.right == null && q.right != null) || (p.right != null && q.right == null))
            return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right); 
    }
    
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
