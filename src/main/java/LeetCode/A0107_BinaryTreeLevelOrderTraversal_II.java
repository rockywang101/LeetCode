package LeetCode;

import java.util.ArrayList;
import java.util.List;


/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 *  
 * @author rocky
 */
public class A0107_BinaryTreeLevelOrderTraversal_II {
    
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Level Order Traversal II.
    // Memory Usage: 36 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal II.
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> rtnList = new ArrayList<List<Integer>>();
        
        if (root == null)
            return rtnList;
        
        visitNode(root, 0, rtnList);
        
        return rtnList;       
    }
    
    private void visitNode(TreeNode node, int level, List<List<Integer>> rtnList) {

        // 若還沒新增過該層的 list，size 會相同，比如第 0 層時，一開始 size 也是 0，新增過後 size 變 1
        if (rtnList.size() == level)
            rtnList.add(0, new ArrayList<Integer>()); // 從開頭的位置 insert 進去
        
        rtnList.get(rtnList.size()-level-1).add(node.val);
        
        if (node.left != null)
            visitNode(node.left, level+1, rtnList);
        
        if (node.right != null)
            visitNode(node.right, level+1, rtnList);
    }
    
}
