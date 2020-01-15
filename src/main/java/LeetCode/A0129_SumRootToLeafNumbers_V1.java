package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 * 
 * 這個版本沒有想到可以在 visitNode 的時候就順便得到數字並且加總起來
 * 在 V2 重新再實作
 *  
 * Runtime: 1 ms, faster than 26.34% of Java online submissions for Sum Root to Leaf Numbers.
 * Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Sum Root to Leaf Numbers.
 * @author rocky
 */
public class A0129_SumRootToLeafNumbers_V1 {
    
    public int sumNumbers(TreeNode root) {
    
        List<LinkedList<Integer>> allPath = new LinkedList<LinkedList<Integer>>();
        
        visitNode(root, allPath, new LinkedList<Integer>());
        
        int sum = 0;
        for (int i=0; i<allPath.size(); i++)
            sum = sum + pathToInt(allPath.get(i));
        
        return sum;
    }
    
    
    private void visitNode(TreeNode node, List<LinkedList<Integer>> allPath, LinkedList<Integer> path) {
        
        if (node == null)
            return;
        
        path.add(node.val);
        
        if (node.left == null && node.right == null) {
            allPath.add(new LinkedList<Integer>(path));
            path.removeLast();
            return;
        }

        visitNode(node.left, allPath, path);
        visitNode(node.right, allPath, path);
        
        path.removeLast();
    }
    
    private int pathToInt(LinkedList<Integer> path) {
    	
        int num = 0;
        int i = 0;
        while (path.size() != 0) {
            int n = 1;
            for (int x=0; x<i; x++)
                n = n * 10;
            num += path.removeLast() * n;
            i++;
        }
        return num;
    }
}
