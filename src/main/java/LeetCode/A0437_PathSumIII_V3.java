package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class A0437_PathSumIII_V3 {
    
    // 最佳解，知道做法了，但還是沒搞懂為什麼效能會最佳 TODO
    
    // Runtime: 3 ms, faster than 99.92% of Java online submissions for Path Sum III.
    // Memory Usage: 39.4 MB, less than 86.36% of Java online submissions for Path Sum III.
    public int pathSum(TreeNode root, int sum) {
        
//        System.out.println("pathSum--------------");
        Map<Integer,Integer> preSumMap = new HashMap<>();
        
        preSumMap.put(0, 1);
        
        return recur(root, 0, sum, preSumMap);
    }
    
    public int recur(TreeNode root, int currSum,int targetSum, Map<Integer,Integer> preSumMap){

        if(root == null)
            return 0;
        
//        System.out.println("node.val => " + root.val);
        
        currSum = currSum + root.val;
        
        int count = preSumMap.getOrDefault(currSum - targetSum, 0);
//        System.out.println("find surrSum: " + currSum +"-targetSum: " + targetSum + " = " + (currSum-targetSum) + ", count => " + count);
        
        preSumMap.put(currSum, preSumMap.getOrDefault(currSum, 0) + 1);
//        System.out.println(preSumMap);
        
        count = count + recur(root.left, currSum, targetSum, preSumMap) + recur(root.right, currSum, targetSum, preSumMap);
        
        preSumMap.put(currSum, preSumMap.get(currSum) - 1);
//        System.out.println(preSumMap);
//        System.out.println("=====================");
        
        return count;
    }
}
