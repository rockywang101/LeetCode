package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/same-tree/
 * 
 * while version 
 * 
 * @author rocky
 */
public class A0100_SameTree_V2 {

    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
    // Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Same Tree.
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        
        queue1.add(p);
        queue2.add(q);
        
        while (! queue1.isEmpty() || ! queue2.isEmpty()) {
       
            for (int i=0; i<queue1.size(); i++) {
                TreeNode node1 = queue1.remove();
                TreeNode node2 = queue2.remove();
                
                if (node1 == null && node2 == null)
                    continue;
                
                if (node1 == null || node2 == null)
                    return false;
                
                if (node1.val != node2.val)
                    return false;
                
                queue1.add(node1.left); // 不判斷 null
                queue1.add(node1.right); // 因為 null 也應該被加進去
                queue2.add(node2.left); // 這樣才能比到類似 [1,2] vs [1,null,2] 的案例
                queue2.add(node2.right);
            }
        }
        
        return true; // finally p and q are all null and no different
    }
    
}
