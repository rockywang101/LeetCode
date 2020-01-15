package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum-ii/
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Path Sum II.
 * Memory Usage: 38.3 MB, less than 100.00% of Java online submissions for Path Sum II.
 * @author rocky
 */
public class A0113_PathSumII_V2 {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> rtnList = new LinkedList<List<Integer>>();
        
        visitNode(root, sum, rtnList, new LinkedList<Integer>());
        
        return rtnList;
    }
    
    private void visitNode(TreeNode node, int sum, List<List<Integer>> rtnList, LinkedList<Integer> path) {

        if (node == null)
            return;
        
        path.add(node.val);
        
        if (node.left == null && node.right == null) {
            
            if (node.val == sum)
                rtnList.add(new LinkedList<Integer>(path));
            
            path.removeLast();
            return;
        }

        visitNode(node.left, sum-node.val, rtnList, path);

        visitNode(node.right, sum-node.val, rtnList, path);
        
        path.removeLast();
    }
}
