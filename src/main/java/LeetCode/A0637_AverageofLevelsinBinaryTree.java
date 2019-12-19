package LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 * 
 * @author rocky
 */
public class A0637_AverageofLevelsinBinaryTree {

    // Runtime: 2 ms, faster than 96.91% of Java online submissions for Average of Levels in Binary Tree.
    // Memory Usage: 39.3 MB, less than 100.00% of Java online submissions for Average of Levels in Binary Tree.
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> rtnList = new LinkedList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        
        while (! queue.isEmpty()) {
            double sum = 0;
            int currentLevelNodeNum = queue.size();
            for (int i=0; i<currentLevelNodeNum; i++) {
                TreeNode node = queue.remove();
                sum += node.val;
                
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null) 
                    queue.add(node.right);
            }
            
            rtnList.add(sum / currentLevelNodeNum);
        }
        
        return rtnList;
    }

    
    // Runtime: 4 ms, faster than 12.72% of Java online submissions for Average of Levels in Binary Tree.
    // Memory Usage: 39.5 MB, less than 100.00% of Java online submissions for Average of Levels in Binary Tree.
    public List<Double> averageOfLevelsV1(TreeNode root) {

        List<Double> rtnList = new LinkedList<Double>();
        rtnList.add(Double.valueOf(root.val));
        
        if (root.left == null && root.right == null)
            return rtnList;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        if (root.left != null)
            stack.add(root.left);
        if (root.right != null)
            stack.add(root.right);
        
        while (! stack.isEmpty()) {
            Stack<TreeNode> tmpStack = new Stack<TreeNode>();
            int cnt = 0;
            long sum = 0; 
            while (! stack.isEmpty()) {
                TreeNode node = stack.pop();
                sum = sum + node.val;
                cnt++;
                if (node.left != null)
                    tmpStack.add(node.left);
                if (node.right != null)
                    tmpStack.add(node.right);
            }
            
            rtnList.add(sum / (double)cnt);
            stack.addAll(tmpStack);
        }

        return rtnList;
    }
    
    public static void main(String[] args) {
        
        System.out.println(5/(double)3);
        
        
    }
}
