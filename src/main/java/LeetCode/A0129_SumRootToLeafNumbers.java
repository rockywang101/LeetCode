package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/sum-root-to-leaf-numbers/
 *  
 * Runtime: 1 ms, faster than 26.34% of Java online submissions for Sum Root to Leaf Numbers.
 * Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Sum Root to Leaf Numbers.
 * @author rocky
 */
public class A0129_SumRootToLeafNumbers {
    
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
    
    
    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        
        root.left = left;
        root.right = right;
        
        int num = new A0129_SumRootToLeafNumbers().sumNumbers(root);
        System.out.println(num);
    }
}
