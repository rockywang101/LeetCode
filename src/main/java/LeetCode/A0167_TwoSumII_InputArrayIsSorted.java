package LeetCode;

/** 
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * Runtime: 4 ms, faster than 14.24% of Java online submissions for Two Sum II - Input array is sorted.
 * Memory Usage: 38.2 MB, less than 88.81% of Java online submissions for Two Sum II - Input array is sorted.
 * 
 * 因為有寫一版先找出最後一個比較小的敗的版本，但過不了這個 unit test，先改這版先能過，但效能很差
 * [-3,3,4,90] 
 * 0
 * @author rocky
 */
public class A0167_TwoSumII_InputArrayIsSorted {
    
    public int[] twoSum(int[] nums, int target) {
     
        for (int i=0; i<nums.length; i++) {
            
            int start = i + 1;
            int end = nums.length - 1;
            int diff = target - nums[i];

            while (start <= end) {
                int middle = (start + end) / 2;
                
                if (nums[middle] == diff)
                    return new int[] {i+1, middle+1};
                
                if (nums[middle] < diff) {
                    start = middle + 1;
                }
                else {
                    end = middle - 1;
                }
            }
        }
        
        return null;
    }
    
    
    public static void main(String[] args) {
        int[] nums = new int[] {-3,3,4,90};
        
        int[] n = new A0167_TwoSumII_InputArrayIsSorted().twoSum(nums, 0);
        
        System.out.println(n[0] + "  " + n[1]);
    }
}
