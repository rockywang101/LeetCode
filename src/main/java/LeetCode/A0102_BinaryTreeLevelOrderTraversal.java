package LeetCode;

import java.util.ArrayList;
import java.util.List;


/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 *  
 * @author rocky
 */
public class A0102_BinaryTreeLevelOrderTraversal {
    
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
    // Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> rtnList = new ArrayList<List<Integer>>();
        
        if (root == null)
            return rtnList;
        
        visitNode(root, 0, rtnList);

        return rtnList;       
    }
    
    private void visitNode(TreeNode node, int level, List<List<Integer>> rtnList) {

        // 若還沒新增過該層的 list，size 會相同，比如第 0 層時，一開始 size 也是 0，新增過後 size 變 1；
        if (rtnList.size() == level)
            rtnList.add(new ArrayList<Integer>());
        
        rtnList.get(level).add(node.val);
        
        if (node.left != null)
            visitNode(node.left, level+1, rtnList);
        if (node.right != null)
            visitNode(node.right, level+1, rtnList);
    }
    
}
