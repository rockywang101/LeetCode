package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


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

        if (rtnList.size() == level) {
            rtnList.add(new ArrayList<Integer>());
        }
        
        rtnList.get(level).add(node.val);
        
        if (node.left != null)
            visitNode(node.left, level+1, rtnList);
        if (node.right != null)
            visitNode(node.right, level+1, rtnList);
    }
    
    
    // Runtime: 1 ms, faster than 86.00% of Java online submissions for Binary Tree Level Order Traversal.
    // Memory Usage: 36 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
    public List<List<Integer>> levelOrderV1(TreeNode root) {
        
        if (root == null)
            return new LinkedList<List<Integer>>();;
        
        Map<Integer, List<Integer>> map = new HashMap<>();

        visitNodeV1(root, 0, map);
        
        List<List<Integer>> rtnList = new LinkedList<List<Integer>>();
        for (int i=0; i<map.size(); i++) {
            rtnList.add(map.get(i));
        }
        
        return rtnList;
    }
    
    
    private void visitNodeV1(TreeNode node, int level, Map<Integer, List<Integer>> map) {
        
        List<Integer> list = map.get(level);
        if (list == null) {
            list = new LinkedList<Integer>();
            map.put(level, list);
        }
        
        list.add(node.val);
        
        if (node.left != null)
            visitNodeV1(node.left, level+1, map);
        if (node.right != null)
            visitNodeV1(node.right, level+1, map);
    }
}
