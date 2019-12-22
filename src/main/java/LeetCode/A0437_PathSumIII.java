package LeetCode;

import java.util.concurrent.atomic.AtomicInteger;

public class A0437_PathSumIII {
    
    // 我以為是完美的寫法，結果效能爆炸 >"<
    // Runtime: 22 ms, faster than 8.11% of Java online submissions for Path Sum III.
    // Memory Usage: 38 MB, less than 93.18% of Java online submissions for Path Sum III.
    public int pathSum(TreeNode root, int sum) {
        
        AtomicInteger count = new AtomicInteger(0);

        recursivePathSum(root, sum, count);
        
        return count.get();
    }
    
    
    private void recursivePathSum(TreeNode root, int sum, AtomicInteger count) {

        if (root == null) 
            return;
        
        visitNode(root, sum, count);
        
        recursivePathSum(root.left, sum, count);
        recursivePathSum(root.right, sum, count);
    }
    
    
    private void visitNode(TreeNode node, int sum, AtomicInteger count) {
        
        if (node == null)
            return;
        
        if (node.val == sum)
            count.set(count.get()+1);
        
        sum = sum - node.val;
        
        visitNode(node.left, sum, count);
        visitNode(node.right, sum, count);
    }
}
