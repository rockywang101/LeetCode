package LeetCode;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * 
 * @author rocky
 */
public class A0108_ConvertSortedArrayToBinarySearchTree {
    
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if (nums.length == 0)
            return null;
        
        if (nums.length == 1)
            return new TreeNode(nums[0]);
        
        if (nums.length <= 3)
            return composeTreeNode(nums, 0, nums.length-1, false); // false 往右發展，其實都可以
        
        int middle = nums.length / 2;
        TreeNode root = new TreeNode(nums[middle]);
        
        root.left = composeTreeNode(nums, 0, middle-1, true);
        root.right = composeTreeNode(nums, middle+1, nums.length-1, false);
        
        return root;
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
        
        int middle = length / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = composeTreeNode(nums, start, middle-1, true);
        node.right = composeTreeNode(nums, middle+1, end, false);
        
        return node;
    }
    
    public static void main(String[] args) {
        
        new A0108_ConvertSortedArrayToBinarySearchTree().sortedArrayToBST(new int[] {1,2,3,4,5,6,7,8,9});
    }
}    
