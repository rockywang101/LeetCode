package LeetCode;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * 
 * Runtime: 2 ms, faster than 7.60% of Java online submissions for Convert Sorted Array to Binary Search Tree.
 * Memory Usage: 47.6 MB, less than 5.16% of Java online submissions for Convert Sorted Array to Binary Search Tree.
 * 
 * @author rocky
 */
public class A0108_ConvertSortedArrayToBinarySearchTree_V1 {
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if (nums.length == 0)
            return null;
        
        return composeTreeNode(nums, 0, nums.length-1, false); // false 往右發展，其實都可以
    }
    
    private TreeNode composeTreeNode(int[] nums, int start, int end, boolean isLeft) {
        int length = end - start + 1;
        if (length == 1)
            return new TreeNode(nums[start]);
        
        if (length == 2) {
            if (isLeft) {
                TreeNode node = new TreeNode(nums[end]);
                node.left = new TreeNode(nums[start]);
                return node;
            }
            else {
                TreeNode node = new TreeNode(nums[start]);
                node.right = new TreeNode(nums[end]);
                return node;
            }
        }
        
        if (length == 3) {
            TreeNode node = new TreeNode(nums[start+1]);
            node.left = new TreeNode(nums[start]);
            node.right = new TreeNode(nums[end]);
            return node;
        }
        
        int middle = start + length / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = composeTreeNode(nums, start, middle-1, true);
        node.right = composeTreeNode(nums, middle+1, end, false);
        
        return node;
    }
}    
