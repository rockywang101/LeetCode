package LeetCode;

/** 
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Two Sum II - Input array is sorted.
 * Memory Usage: 48.8 MB, less than 5.22% of Java online submissions for Two Sum II - Input array is sorted.
 * 
 * @author rocky
 */
public class A0167_TwoSumII_InputArrayIsSorted_V4 {
    
    public int[] twoSum(int[] numbers, int target) {
        // binary search for half of target
        int halfOfTarget = target / 2 >= 0 ? target / 2 : target / 2 + 1;
        int left = 0;
        int right = numbers.length - 1;
        while (right - left > 1) {
            int middle = (right + left) / 2;
            
            // for special case [0,0,4,5] 
            if (target % 2 == 0 && numbers[middle] == halfOfTarget) {
                if (middle+1<numbers.length && numbers[middle] + numbers[middle+1] == target)
                    return new int[] {middle+1, middle+2};
                else if (middle-1>=0 && numbers[middle] + numbers[middle-1] == target)
                    return new int[] {middle, middle+1};
            }
            
            if (numbers[middle] > halfOfTarget)
                right = middle;
            else
                left = middle;
        }
        
        // two pointer to find solution
        while (left > 0 || right < numbers.length) {
            if (numbers[left] + numbers[right] == target)
                return new int[] {left+1, right+1};
            
            if (numbers[left] + numbers[right] > target)
                left--;
            else
                right++;
        }
        
        return null; // no solution
    }
    
    
    public static void main(String[] args) {
        
        int[] n;
//        n = new A0167_TwoSumII_InputArrayIsSorted_V4().twoSum(new int[] {2,3,4}, 6);
//        System.out.println(n[0] + "  " + n[1]);
//        System.out.println();
//        n = new A0167_TwoSumII_InputArrayIsSorted_V4().twoSum(new int[] {-3,3,4,5}, 0);
//        System.out.println(n[0] + "  " + n[1]);
//        System.out.println();
        n = new A0167_TwoSumII_InputArrayIsSorted_V4().twoSum(new int[] {0,0,4,5}, 0);
        System.out.println(n[0] + "  " + n[1]);
    }
}
