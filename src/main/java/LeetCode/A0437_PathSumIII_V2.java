package LeetCode;


/**
 * https://leetcode.com/problems/path-sum-iii/
 * 
 * @author rocky
 */
public class A0437_PathSumIII_V2 {
   
    // 改用加法寫，不傳入 AtomicInteger
    
    // Runtime: 11 ms, faster than 50.94% of Java online submissions for Path Sum III.
    // Memory Usage: 39.9 MB, less than 79.55% of Java online submissions for Path Sum III.
    public int pathSum(TreeNode root, int sum) {
        
        if (root == null) 
            return 0;
        
        return visitNode(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    
    private int visitNode(TreeNode node, int sum) {
        
        if (node == null)
            return 0;

        int count = visitNode(node.left, sum - node.val) + visitNode(node.right, sum-node.val); 
        
        if (node.val == sum) 
            count++;
        
        return count;
    }
}
