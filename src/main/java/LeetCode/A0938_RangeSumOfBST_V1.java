package LeetCode;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 * 
 * first versin，先寫個最簡單的版本，全部跑一輪 !   這用在不是 BST 的時候可以這樣幹
 * 
 * Runtime: 1 ms, faster than 55.57% of Java online submissions for Range Sum of BST.
 * Memory Usage: 48.3 MB, less than 70.35% of Java online submissions for Range Sum of BST.
 * 
 * @author rocky
 */
public class A0938_RangeSumOfBST_V1 {
    
    public int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null)
            return 0;
        
        int nodeVal = root.val >= L && root.val <= R ? root.val : 0;
        
        return nodeVal + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}
