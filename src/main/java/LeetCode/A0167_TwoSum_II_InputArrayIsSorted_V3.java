package LeetCode;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * refs network solution , understand and implement my version
 * 
 * @author rocky
 */
public class A0167_TwoSum_II_InputArrayIsSorted_V3 {
    
    public int[] twoSum(int[] numbers, int target) {

        // binary search for half of target
        int halfOfTarget = target / 2;
        int left = 0;
        int right = numbers.length - 1;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            if (numbers[middle] > halfOfTarget)
                right = middle;
            else
                left = middle;
        }
        
        System.out.println(left + " " + right);
        // two pointer to find solution
        while (left > 0 || right < numbers.length) {
            if (numbers[left] + numbers[right] == target && left != right)
                return new int[] {left+1, right+1};
            
            if (numbers[left] + numbers[right] > target)
                right--;
            else
                left++;
        }
        
        return null; // no solution
    }
    
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 3, 4};
        new A0167_TwoSum_II_InputArrayIsSorted_V3().twoSum(numbers, 6);
    }
}
