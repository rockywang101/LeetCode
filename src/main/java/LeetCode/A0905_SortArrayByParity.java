package LeetCode;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 * 
 * 很基本的 two pointer 問題，但要注意 while right-- 處理的地方
 * 
 * Runtime: 1 ms, faster than 99.90% of Java online submissions for Sort Array By Parity.
 * Memory Usage: 41.1 MB, less than 81.95% of Java online submissions for Sort Array By Parity.
 * 
 * @author rocky
 */
public class A0905_SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        
        int left = 0;
        int right = A.length - 1;

        while (left < right) {

            if (A[left] % 2 == 0) {
                left++;
                continue;
            }
            else {
                while (A[right] % 2 == 1 && right > left)
                    right--; // find right index that is even element
                
                if (left != right) {
                    int tmp = A[right];
                    A[right] = A[left];
                    A[left] = tmp;
                }
                
                left++;
                right--;
            }
        }
        
        return A;
    }
}
