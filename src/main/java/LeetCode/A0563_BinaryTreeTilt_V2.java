package LeetCode;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/binary-tree-tilt/
 * 
 * 參考網路上的版本
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Tilt.
 * Memory Usage: 41.6 MB, less than 9.09% of Java online submissions for Binary Tree Tilt.
 * 
 * @author rocky
 */
public class A0563_BinaryTreeTilt_V2 {

    int tilt = 0;
    
    public int findTilt(TreeNode root) {
    	AtomicInteger tilt = new AtomicInteger();
        solve(root, tilt);
        return tilt.intValue();
    }
    
    public int solve(TreeNode root, AtomicInteger tilt) {
    	
        if(root == null)
            return 0;
        
        int left = solve(root.left, tilt);
        int right = solve(root.right, tilt);
        
        tilt.set(tilt.intValue() + Math.abs(left - right));
        
        return root.val + left + right;
    }
}
