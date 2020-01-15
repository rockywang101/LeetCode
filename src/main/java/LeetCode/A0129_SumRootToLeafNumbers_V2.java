package LeetCode;

/**
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Sum Root to Leaf Numbers.
 * Memory Usage: 35.1 MB, less than 100.00% of Java online submissions for Sum Root to Leaf Numbers.
 * @author rocky
 */
public class A0129_SumRootToLeafNumbers_V2 {
    
    public int sumNumbers(TreeNode root) {
    
        return visitNode(root, 0);
    }
    
    private int visitNode(TreeNode node, int num) {
        
    	if (node == null)
    		return 0;
    	
        num = num * 10 + node.val;
        
        if (node.left == null && node.right == null)
            return num;

        return visitNode(node.left, num) + visitNode(node.right, num);
    }
}
