package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-paths/
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Paths.
 * Memory Usage: 36.9 MB, less than 100.00% of Java online submissions for Binary Tree Paths.
 * @author rocky
 */
public class A0257_BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
     
        List<String> rtnList = new LinkedList<String>();
        
        visitNode(root, rtnList, new LinkedList<Integer>());
        
        return rtnList;
    }
    
    private void visitNode(TreeNode node, List<String> rtnList, LinkedList<Integer> path) {
        
        if (node == null)
            return;
        
        path.add(node.val);
        
        if (node.left == null && node.right == null) {
            rtnList.add(pathToString(path));
            path.removeLast();
            return;
        }
        
        visitNode(node.left, rtnList, path);
        visitNode(node.right, rtnList, path);
        
        path.removeLast();
    }
    
    private String pathToString(List<Integer> path) {
        
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<path.size(); i++) {
            sb.append(path.get(i));
            if (i<path.size()-1)
                sb.append("->");
        }
        
        return sb.toString();
    }
}
