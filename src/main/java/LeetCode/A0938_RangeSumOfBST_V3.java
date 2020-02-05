package LeetCode;

import java.util.LinkedList;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 * 
 * iterative version
 * 
 * Runtime: 2 ms, faster than 20.71% of Java online submissions for Range Sum of BST.
 * Memory Usage: 46.2 MB, less than 96.51% of Java online submissions for Range Sum of BST.
 * 
 * @author rocky
 */
public class A0938_RangeSumOfBST_V3 {
    
    public int rangeSumBST(TreeNode root, int L, int R) {

        if (root == null)
            return 0;

        int result = 0;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);

        while (! list.isEmpty()) {
            
            for (int i=0, size=list.size(); i<size; i++) {
                
                TreeNode node = list.removeFirst();
                if (node == null)
                    continue;
                
                if (node.val > R) {
                    list.add(node.left);
                }
                else if (node.val < L) {
                    list.add(node.right);
                }
                else {
                    result += node.val;
                    list.add(node.left);
                    list.add(node.right);
                }
            }
        }
        
        return result;
    }
}
