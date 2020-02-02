package LeetCode;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * 
 * network version, more clear
 * 
 * Runtime: 1 ms, faster than 7.60% of Java online submissions for Convert Sorted Array to Binary Search Tree.
 * Memory Usage: 47.4 MB, less than 5.16% of Java online submissions for Convert Sorted Array to Binary Search Tree.
 * @author rocky
 */
public class A0108_ConvertSortedArrayToBinarySearchTree_V2 {

    public TreeNode sortedArrayToBST(int[] nums) {
        
        return sortedArrayToBST(nums, 0, nums.length-1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
        
        if (start > end)
            return null;
        
        int middle = start + (end - start) / 2;
        
        TreeNode root = new TreeNode(nums[middle]);
        root.left = sortedArrayToBST(nums, start, middle - 1);
        root.right = sortedArrayToBST(nums, middle + 1, end);
        
        return root;
    }
}
