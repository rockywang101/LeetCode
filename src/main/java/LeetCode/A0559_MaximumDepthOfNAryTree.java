package LeetCode;

/**
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of N-ary Tree.
 * Memory Usage: 39.4 MB, less than 100.00% of Java online submissions for Maximum Depth of N-ary Tree.
 * 
 * @author rocky
 */
public class A0559_MaximumDepthOfNAryTree {

    public int maxDepth(Node root) {

    	if (root == null)
    		return 0;
    	
    	if (root.children == null || root.children.size() == 0)
    		return 1;
    	
    	int max = 0;
    	for (int i=0; i<root.children.size(); i++)
    		max = Math.max(max, maxDepth(root.children.get(i)));
    	
    	return 1 + max;
    }
}
