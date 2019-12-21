package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class A0113_PathSumII {

    // 沒有想到可以用同一個 pathList 去操作就好，在必要時再 new 新的被加進去
    // Runtime: 1 ms, faster than 100.00% of Java online submissions for Path Sum II.
    // Memory Usage: 37.8 MB, less than 100.00% of Java online submissions for Path Sum II.
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        List<List<Integer>> resultList = new LinkedList<List<Integer>>();

        visitNode(root, sum, new LinkedList<Integer>(), resultList);
        
        return resultList;
    }

    
    private void visitNode(TreeNode node, int sum, LinkedList<Integer> pathList, List<List<Integer>> resultList) {

        if (node == null)
            return; // prevent root is null
        
        sum = sum - node.val;
        pathList.add(node.val);
        
        if (node.left == null && node.right == null && sum == 0) {
            resultList.add(new LinkedList<Integer>(pathList));
            pathList.removeLast();
            return;
        }
        
        if (node.left != null) {
            visitNode(node.left, sum, pathList, resultList);
        }
        
        if (node.right != null) {
            visitNode(node.right, sum, pathList, resultList);
        }
        
        pathList.removeLast();
    }
    
    
    // Runtime: 5 ms, faster than 6.32% of Java online submissions for Path Sum II.
    // Memory Usage: 47.7 MB, less than 6.06% of Java online submissions for Path Sum II.
    public List<List<Integer>> pathSumV1(TreeNode root, int sum) {
 
        List<List<Integer>> outerList = new LinkedList<List<Integer>>();

        visitNodeV1(root, sum, new LinkedList<Integer>(), outerList);
        
        return outerList;
    }
    
    
    private void visitNodeV1(TreeNode node, int sum, List<Integer> innerList, List<List<Integer>> outerList) {

        if (node == null)
            return; // prevent root is null
        
        sum = sum - node.val;
        innerList.add(node.val);
        
        if (node.left == null && node.right == null && sum == 0) {
            outerList.add(innerList);
            return;
        }
        
        if (node.left != null) {
            List<Integer> newInnerList = new LinkedList<Integer>(innerList);
            visitNodeV1(node.left, sum, newInnerList, outerList);
        }
        
        if (node.right != null) {
            List<Integer> newInnerList = new LinkedList<Integer>(innerList);
            visitNodeV1(node.right, sum, newInnerList, outerList);
        }
    }
    
}
